package phoneAnswer;

public class PhoneUnivInfo extends PhoneInfo {
	String major;
	int year;

	public PhoneUnivInfo(String name, String phoneNum, String major, int year) {
		super(name, phoneNum);
		this.major = major;
		this.year = year;
	}

	@Override
	void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);

	}

}
