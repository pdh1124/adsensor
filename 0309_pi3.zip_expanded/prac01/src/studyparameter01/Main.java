package studyparameter01;

import java.util.Scanner;

class PhoneInfo {
	String name;
	String phoneNum;
	String birth;

	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getBirth() {
		return birth;
	}

//   @Override
//   public String toString() {
//      return "PhoneInfo [name=" + name + ", phoneNum=" + phoneNum + ", birth=" + birth + "]";
//   }   

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("--------------");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.println("--------------");

			int a = sc.nextInt();
			sc.nextLine();// 불필요한 엔터 제거.

			if (a == 1) {
				System.out.println("데이터 입력");

				// Scanner nc = new Scanner(System.in);
				System.out.print("이름:");
				String name = sc.nextLine();
				System.out.print("전화번호:");
				String phoneNum = sc.nextLine();
				System.out.print("생일:");
				String birth = sc.nextLine();

				PhoneInfo pi1;
				if (birth.equals("")) {
					pi1 = new PhoneInfo(name, phoneNum);
				} else {
					pi1 = new PhoneInfo(name, phoneNum, birth);
				}

				System.out.println("name: " + pi1.getName());
				System.out.println("Phone: " + pi1.getPhoneNum());
				if (pi1.getBirth() != null) {
					System.out.println("birth: " + pi1.getBirth());
				}
			} else if (a == 2) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		} // end_while
		sc.close();
	}
}