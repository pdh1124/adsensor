package generic;

public interface S08인터페이스의인터페이스 {
	final int TIMEOUT = 10000; // 상수 필드 선언
	
	//앞에 abstract를 안쓰는 이유는 {}를 안쓰기 때문에 추상적인 메소드이다 라고 인식하기 때문
	/*abstract*/void sendCall(); // 추상 메소드

	void receiveCall(); // 추상 메소드

	default void printLogo() { // default 메소드
		System.out.println("** Phone **");
	}
}
