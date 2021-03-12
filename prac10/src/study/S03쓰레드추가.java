package study;

import java.awt.Toolkit; //gui 중심의 응용프로그램을 작성할 때 유용한 도구들이 모여 있음.(웹 프로그램에서 잘 쓰지 않음)

class BeepTask implements Runnable {
	// Runnable 인터페이스 구현 클래스. 인터페이스는 --able 로 관례적 표현.
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 띵~ 이라는 소리내기.
		// 객체 얻어오기.하나의 객체를 재사용. 싱글톤.
		for (int i = 0; i < 5; i++) {
			toolkit.beep();// 소리내기.
			try {
				Thread.sleep(500); // 500 은 milli-sec 1/1000초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // 0.5초 간격으로 띵 소리내기.
	}
}

public class S03쓰레드추가 {
	public static void main(String[] args) {
		Runnable beep = new BeepTask();// 다형성.묵시적 형변환.
		Thread t = new Thread(beep);// 스레드 생성.t.start();// run() 호출.
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
