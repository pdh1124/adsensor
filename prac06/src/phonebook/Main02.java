package phonebook;

import java.util.Scanner;

class PhoneNumber {
	private String name;
	private String phoneNum;
	private String birth;

	public PhoneNumber(String name) {
		this.name = name;
	}

	public PhoneNumber(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public PhoneNumber(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}

	public String showInfo() {
		return "name: " + name + "\nphone: " + phoneNum + "\nbirth: " + birth;
	}

}

public class Main02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("메뉴를 선택하세요.");
		System.out.println("----------------");
		System.out.println("1.데이터 입력");
		System.out.println("2.프로그램 종료");
		System.out.println("----------------");

		int a = scan.nextInt();
		boolean x = true;
		while (x) {
			if (a == 1) {
				PhoneNumber p1 = new PhoneNumber("홍길동", "111-2222", "99년 4월 17일생");
				System.out.println("선택:" + a);
				System.out.println(p1.showInfo());
				a = scan.nextInt();
				
			} else if (a == 2) {
				System.out.println("선택:" + a);
				System.out.println("전화번호부가 종료되었습니다.");
				x = false;
			} else {
				System.out.println("해당 번호는 유효하지 않습니다.");
				x = false;
			}
		}
	}

	private static Object x(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}
