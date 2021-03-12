package phoneAnswer;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	// 직렬화를 위해서는 Serializable 인터페이스를 구현하라.
	// 직렬화 : 객체를 바이너리 정보로 전환하여 원격지로 보내는 기술.
	
	private String name;
	private String phoneNum;

	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	void showPhoneInfo() {
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phoneNum);
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() { 
		return name.hashCode(); //해쉬코드 ex)44502158
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PhoneInfo) {
			PhoneInfo n = (PhoneInfo) obj;
			if (n.name.equals(name)) {
				return true;
			}
		}
		return false;
	}

}




