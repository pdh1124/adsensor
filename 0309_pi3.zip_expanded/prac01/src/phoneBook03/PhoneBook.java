package phoneBook03;

import java.util.Scanner;

public class PhoneBook {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();

		// 메소드 안에 선언한 변수는 메소드가 끝나면 사라짐. 사용 불가.
		// 공유 변수는 메소드 바깥쪽, 클래스 안쪽에 선언. 여러 메소드에서 해당 변수를 공유.

		while (true) {
			Menu.showMenu();// Menu 클래스의 showMenu 메소드 호출.
			// 객체 생성후 접근이 아니다.
			// 메뉴를 반복 표시하면서, 선택에 따라 처리를 분기.

			int input = sc.nextInt();

			if (input == 1) {// 입력.
				manager.readData();
			} else if (input == 2) {// 검색
				manager.searchData();
			} else if (input == 3) {// 삭제
				manager.deleteData();
			} else {
				break;// 프로그램 종료.
			}
		}
		sc.close();// 사용한 입력 처리관련 자원을 운영체제에 반납.
	}

}
