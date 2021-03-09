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

	public void showInfo() {
		System.out.println("name: " + name + "\nphone: " + phoneNum + "\nbirth: " + birth);
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

		

		boolean x = true;
		int a = scan.nextInt();
		while (x) {
			scan.nextLine();// 불필요한 엔터 제거.
			
			if (a == 1) {
				System.out.print("이름을 입력하세요 : ");
				String pName = scan.nextLine();
				System.out.print("전화번호를 입력하세요 :");
				String pNum = scan.nextLine();
				System.out.print("생일을 입력하세요 : ");
				String pBirth = scan.nextLine();
				
				PhoneNumber p1;
				if (pBirth.equals("")) {
					p1 = new PhoneNumber(pName, pNum);
				} else {
					p1 = new PhoneNumber(pName, pNum, pBirth);
				}
				System.out.println("선택:" + a);
				p1.showInfo();
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
}
