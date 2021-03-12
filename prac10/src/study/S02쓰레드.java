package study;

class Sum {
	int num;

	public Sum() {
		num = 0;
	}

	public void addNum(int n) {
		num += n;// 누적 처리
	}

	public int getNum() {
		return num;// 누적된 값 출력.
	}
}

class AdderThread extends Sum implements Runnable {
	int start, end;

	public AdderThread(int s, int e) {
		start = s;
		end = e;
	}
	
	//@Override : @Override를 원래 써줘야 하지만 부모 클래스명과 같게 들어가면 자바에서 유연하게 Override되었다고 처리 할 수 있다.
	//컴파일러는 부모 메소드와 동일한 메소드가 자식에 있으면, Override키워드가 없어도 오버라이드 메소드로 인식함
	public void run() { // implements Runnable로 받게되면 무조건 run메소드를 만들어야 한다.
		for (int i = start; i <= end; i++)
			addNum(i);// 예) start=1, end=10 이라면 1+2+3+4+...+10
	}
}

public class S02쓰레드 {
	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1, 500);
		AdderThread at2 = new AdderThread(501, 1000);
		Thread tr1 = new Thread(at1);
		// Runnable의 구현체를 스레드에 전달값으로 전달해서 스레드 생성.
		Thread tr2 = new Thread(at2);
		tr1.start();// at1의 run() 호출
		tr2.start();// at2의 run() 호출

		
		try {
			tr1.join(); // join():스레드가 끝날때 까지 기다림.
			tr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의 합:" + (at1.getNum() + at2.getNum()));
		//위에 try-catch문을 주석하고 출력하면 계속 값이 바꿈 : 쓰레드를 쓸때 관리를 잘해야한다.
		
		//각각의 쓰레드가 동작하고, 메인쓰레드가 온전히 연산이 끝난다음에
		//결과를 취합하는 것이 아니므로, 총합계는 부정확해짐.
		//그 문제를 해결하기 위한 메소드로 join() 이 있고,
		//이 메소드는 하나의 쓰레드 처리 결과가 온전히 나온다음에 다음쓰레드의 결과를 사용함.
	}
}