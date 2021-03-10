package phoneBook03;

public class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birth;

	public PhoneInfo(String name, String phoneNumber, String birthday) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birthday;
	}
	// 생성자 역할 : 객체를 초기화. 클래스를 통해서 동일한 형식의 객체 생성.
	// int a=5; 정수형 변수a를 5로 초기화.
	// 객체와 클래스의 차이 : 붕어빵과 붕어빵틀.
	// 생성자 특징 : 리턴 타입이 없다.
	// (매개변수가 없는) 기본 생성자 명시하지 않는다면 컴파일러가자동생성.
	// 생성자의 이름은 클래스명과 같다.

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		if (birth != null)
			System.out.println("birth: " + birth);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
