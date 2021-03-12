package study;

//은행을 예로 들면 잔고가 만원있던 카드와 통장에서 우연히 동시에 만원을 뽑는다면 문제가 생긴다.
//그래서 synchronized(씽크로나이즈드)를 쓰는데 스레드의 동시 접속 불허하게 만든다.

class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		// 스레드의 동시 접속 불허.
		this.memory = memory;
		try {
			Thread.sleep(2000);// 2초간 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		// 스레드의 이름 : 메모리
	}
}

class User1 extends Thread {
	private Calculator cal;
	// 객체 + 객체 = 새로운 객체
	// 객체 안에 또다른 객체를 추가하여 새로운 객체 생성.
	// 나무 객체와 철근 객체를 합쳐서 의자 객체가 생성되는 것처럼.

	public void setCal(Calculator cal) {
		this.setName("User1");
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.setMemory(100);
	}
}

class User2 extends Thread {
	private Calculator cal;

	public void setCal(Calculator cal) {
		this.setName("User2");
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.setMemory(50);
	}
}

public class S05씽크로나이즈드 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		User1 user1 = new User1();
		user1.setCal(cal);
		user1.setPriority(1);
		
		User2 user2 = new User2();
		user2.setCal(cal);
		user2.setPriority(10);
		
		user2.start();
		user1.start();
	}
	
	// 사용자 2명이 1개의 계산기를 공유하고 있는 상황.
	// 사용중에 다른 스레드가 개입하면 오류 발생하므로,
	// 중요 메소드는 스레드의 동시 접근을 차단.
	
	//                2초뒤
	//User2:50        2초뒤
	//User1:100
	
	//이 나온다 13번째 줄의 synchronized를 지워주게 되면
	
	//                2초뒤
	//User2:50       
	//User1:100
	
	//로 나온다.
	
}

