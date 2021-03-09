package phonebook;

class PhoneInfo {
	private String name;
	private String phoneNum;
	private String birth;

	public PhoneInfo() {

	}

	public PhoneInfo(String name) {
		this.name = name;
	}

	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}

	public void showPhoneInfo() {
		System.out.println("이름 : " + name + ", 연락처 : " + phoneNum + ", 생일 : " + birth);
	}

}

public class Main01 {

	public static void main(String[] args) {
		PhoneInfo pInfo1 = new PhoneInfo("홍길동", "111-2222", "90/08/30");
		PhoneInfo pInfo2 = new PhoneInfo("이순신", "222-3333");

		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();

	}

}
