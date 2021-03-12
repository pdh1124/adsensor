package study;

import java.awt.Toolkit;

public class S04쓰레드익명구현내부클래스 {
	public static void main(String[] args) {
		// Runnable beep = new BeepTask();// 다형성.묵시적 형변환.
		// Thread t = new Thread(beep);// 스레드 생성.
		// t.start();// run() 호출.
		// 런어블 객체를 생성해서, 그 런어블 객체를 스레드 생성자의 매개변수로 전달하고, 스레드 생성.
		// 생성된 스레드.start();
		
		
		// 익명 구현 내부 클래스.
		new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				// 객체 얻어오기.하나의 객체를 재사용. 싱글톤.
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(5); // 500 은 milli-sec 1/1000초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
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
