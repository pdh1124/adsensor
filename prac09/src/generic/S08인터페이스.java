package generic;

//인터페이스 
//인터페이스 : 이종 간의 편리한 사용을 목적.

//ui : User Interface, 자동차 컨트롤 창.
//cui : character User Interface : 검은색 콘솔창.
//gui : graphic User Interface : 마우스로 화면 제어.

//연결 규약을 정의.
//자바의 단일 상속을 보완하는 역할.

// interface 라는 예약어 이용.

//인터페이스 구성요소,
//- 상수, final
//- 추상 메소드 abstract
//- 디폴트 메소드 default
//- 프라이빗 메소드 private
//- 스태틱 메소드 static

public class S08인터페이스 implements S08인터페이스의인터페이스 {
	// 인터페이스를 이용하여 사용하는 객체의 사용법을 고정.
	// 상속 : extends
	// 인터페이스 : implements
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

	public static void main(String[] args) {
		S08인터페이스 phone = new S08인터페이스();
		
		//인터페이스에서 상속받은 클래스가 어떻게 생성하는지
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
