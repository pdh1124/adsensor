package phoneBook03;

public class Menu {
	static void showMenu() {
		// 객체 생성 없이 호출할 수 있다.
		// 클래스명.showMenu();
		// 1. 2.... 3..
		System.out.println("메뉴를 선택하세요.");
		System.out.println("---------------");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 종료");
		System.out.println("---------------");
		// 안내 메세지의 역할.
		// 클래스 분리와 static 의 사용을 연습.
	}
}
