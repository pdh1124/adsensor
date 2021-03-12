package study;

// 스레드 thread
// 나루토 분신술 비슷. 요정 같은 역할.
// 쓰레드를 사용하면 동시에 여러가지 일을 처리할 수 있지만, 관리가 까다롭다.

class ShowThread extends Thread {// 스레드 사용을 위해서 Thread 상속.
	String threadName;

	public ShowThread(String name) {
		threadName = name;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("안녕하세요. " + threadName + "입니다.");
			try {
				sleep(100); // 1/1000 초 단위로 실행흐름을 일시적으로 멈춘다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class S01쓰레드 {
	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("멋진 쓰레드");
		ShowThread st2 = new ShowThread("예쁜 쓰레드");
		st1.start();// start를 실행하면 run이 호출된다. ( = 쓰레드의 run 메소드 호출.)
		st2.start();// 작업이 거의 동시에 처리됨.
		//st1.run(); st2.run(); 호출시 동시 작업 안됨. 순차적으로 처리됨
	}
}
