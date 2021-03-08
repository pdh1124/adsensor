package phonebook;

class PhoneBook {
	String name;// 참조 자료형, (8개 기본타입 이외의 모든것)
	String phonNumber;
	String blood;
	String address;

	// 우리반의 학생들 : 우리반 클래스, 휴먼 클래스
	// 자동차 클래스 타이어 클래스 객체를 이용.
	public PhoneBook() {
		// 초기화 구문 명시.
		// 생성자 : 객체를 초기화 한다.
		// 생성자는 클래스명과 동일한 이름의 메소드
		// 객체를 생성할때 아무런 값도 초기화 하지 않음.
		// 즉, 메모리 공간만 차지
		// 생성자는 return타입이 없다. 
		
		// 빈값으로 초기화 된다. = 이름 모름, 연락처 모름, 혈액형 모름, 주소 모름 으로 설정을 해두겠다.
	}

// 객체를 생성할때 아무런 값도 초기화 하지 않음.
// 즉, 메모리 공간만 차지.
	public PhoneBook(String phoneNumber) {
		// 매개변수가 1개인 생성자
		// 전화번호 등록을 강제 시킴.
		this.phonNumber = phoneNumber;
	}

	public PhoneBook(String name, String phoneNumber) {
		// 매개변수가 2개인 생성자
		// 이름과 전화번호 등록을 강제 시킴.
		this.name = name;
		this.phonNumber = phoneNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBlood(String blood) {
		this.blood = blood;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 클래스 빈공간에서 우클릭 한다음 source >> generate toString
	@Override // 다시 작성한다는 의미의 어노테이션. 상속 부분
	public String toString() {
		return "PhoneBook [name=" + name + ", phonNumber=" + phonNumber + ", blood=" + blood + ", address=" + address
				+ "]";
	}
}

// 파일 1개의 2개 이상의 클래스가 존재 가능함.
// 메인 메소드는 1개만 있어야 하고,
// public 을 붙이는 클래스는 메인 메소드가 존재하는 클래스
public class Main {

	public static void main(String[] args) {
		
		/*
		PhoneBook p1 = new PhoneBook("홍길동", "010-0000-3333");
		// 개발자가 생성자를 구현하면 컴파일러는 디폴트 생성자를
		// 자동으로 만들지 않음.
		System.out.println(p1.toString() + "\n");

		PhoneBook p2 = new PhoneBook();
		System.out.println(p2.toString() + "\n");

		PhoneBook p3 = new PhoneBook("010-123-4567");
		System.out.println(p3.toString() + "\n");
		p3.setBlood("AA형");
		
		PhoneBook dong = new PhoneBook();
		dong.setAddress("인천");
		dong.setBlood("AB형");
		System.out.println(dong.toString());
		
		dong.setBlood("B형");
		System.out.println(dong.toString() + "\n");
		
		PhoneBook IU = new PhoneBook();
		IU.setName("이지은");
		IU.setBlood("O형");
		System.out.println(IU.toString() + "\n");
		
		PhoneBook Kim = new PhoneBook("김철수", "010-1111-2222");
		Kim.setBlood("B형");
		Kim.setAddress("서울");
		System.out.println(Kim.toString() + "\n");
		*/
		
		PhoneBook[] arr = new PhoneBook[3];
		
		PhoneBook p10 = new PhoneBook("김하나", "010-0000-0001");
		PhoneBook p11 = new PhoneBook("박첨치", "010-0000-0002");
		PhoneBook p12 = new PhoneBook("김현태", "010-0000-0003");
		arr[0] = p10;
		arr[1] = p11;
		arr[2] = p12;
		
		System.out.println("--------------------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);		
			
		}
	} // end of main

} // end of class
