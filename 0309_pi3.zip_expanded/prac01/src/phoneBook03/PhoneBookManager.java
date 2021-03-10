package phoneBook03;

public class PhoneBookManager {
	final int MAX = 100;// final 변수를 상수로 만든다.
	// 변수는 변하는 숫자값.
	// 상수는 변하지 않는 숫자값.
	PhoneInfo[] phoneList = new PhoneInfo[MAX];
	// 연락처를 최대 100개 등록 가능한 배열 생성.
	int cnt = 0;// 100개 중에 몇개를 입력했는지 횟수 확인.

	void readData() {// 입력처리 메소드
		PhoneBook.sc.nextLine();// 눈에 보이지 않는 엔터 제거용.
		// sc 가 static 객체 이므로, 클래스명으로 접근 가능.
		System.out.print("이름:");
		String name = PhoneBook.sc.nextLine();
		System.out.print("전화번호:");
		String phoneNumber = PhoneBook.sc.nextLine();
		System.out.print("생년월일:");
		String birthday = PhoneBook.sc.nextLine();

		PhoneInfo pi = new PhoneInfo(name, phoneNumber, birthday);
		// 전달값 3개를 처리하는 생성자가 없으므로 에러,
		// 해당 에러 위에 커서를 두면, 
		// 선택1) 지워라.
		// 선택2) 해당 생성자를 만들어라.
		phoneList[cnt]=pi;// 생성된 연락처 객체를 객체 배열에 저장.
		cnt++;

//		phoneList[0] = new PhoneInfo("1", "", "");
//		phoneList[1] = new PhoneInfo("2", "", "");
//		phoneList[2] = new PhoneInfo("3", "", "");
//		phoneList[3] = new PhoneInfo("4", "", "");
//		phoneList[4] = new PhoneInfo("5", "", "");
//		cnt = 5;

		System.out.println("데이터 입력이 완료되었습니다.\n");
		// \n은 줄바꿈
	}

	void searchData() {// 검색 처리 메소드
		// 똑같은 이름의 연락처는 없다가 전제.
		// 이름을 입력 받으면, 이름을 등록된 연락처에서 검색후,
		// 있다면, 연락처 표시.
		// 없다면, 찾는 연락처 없음 표시.
		System.out.println("데이터 검색을 시작합니다.");
		PhoneBook.sc.nextLine();// 엔터값 제거
		System.out.print("이름:");
		String name = PhoneBook.sc.nextLine();
		int i = searchIndex(name);
		System.out.println(i + "번째 값을 찾았습니다.");

		if (i != 200) {
			phoneList[i].showPhoneInfo();
		} else {
			System.out.println("찾는 값이 존재하지 않습니다.\n");
		}
	}

	int searchIndex(String name) {
		int index = 200; // 객체 배열의 인덱스가 0~99
		// 검색 실패시 index의 기본값을 리턴하므로, 범위에 없는 값 설정.
		for (int i = 0; i < cnt; i++) {
			// cnt를 사용하는 이유 : 연락처 등록은 1~100건 가능.
			// 몇건을 입력했는지 모르므로 입력된 갯수 사용.
			// phoneList.length 는 항상 100.
			if (name.equals(phoneList[i].getName())) {
				// name 으로 연락처 객체에 접근하지 않는 이유는,
				// 사용자 요청이 해당 값을 private 으로 요구했기 때문에.
				// 직접 접근해서 사용할 수 없고,
				// public 한 메소드를 통해서 값을 읽어 올 수 있음. - 자바의 캡슐화.
				// getter : private 한 값 읽어 오기.
				// setter : private 한 값 저장 하기.
				index = i;
			}
		}

		return index;
	}

	void deleteData() {// 삭제 처리 메소드
		// 일치하는 값 찾기.
		// 찾는 값 삭제.
		// 0,1,2,3,4 상황에서 3번 삭제.
		// 0,1,2,null,4 컴파일러는 순차적 접근하면서 널포인트 에러 발생 시킴.
		// 0,1,2,4 뒤쪽에 값을 삭제한 자리로 당겨오기.
		// 위처럼 변경해야 삭제 이후에도 검색 가능.

		System.out.println("데이터 삭제를 시작합니다...");
		PhoneBook.sc.nextLine();
		System.out.print("이름:");
		String name = PhoneBook.sc.nextLine();
		int i = searchIndex(name);

		if (i != 200) {
			arrSort(i);
			System.out.println(i + "번째 데이터가 삭제 되었습니다.");
			cnt--;
		} else {
			System.out.println("찾는 값이 없습니다.");
		}
		System.out.println("현재 등록된 연락처:" + cnt + "\n");

	}

	void arrSort(int index) {// 배열의 재정렬.
		for (int i = index; i < cnt; i++) {// 0~4
			phoneList[i] = phoneList[i + 1];
			// 삭제할 값은 index
			// 뒤쪽의 배열 값들을 1개씩 당겨서 찾은 배열을 덮어쓰기.
			// 입력된 갯수 만큼만.
			// 1,2,3,4,5
			// 1,2,3,null,5
			// phoneList[4]=phoneList[4+1];
			// 1,2,3,5
		}
//		System.out.println(phoneList.length);//100
		phoneList[cnt] = null;
		// 필요 없음. 갯수 만큼으로 검색하니, 갯수에서 벗어난 null 아닌 값은 체크 안함.
		// 그래도, 혹시 몰라서 널 처리.

//		System.out.println(phoneList.length);//100
		// 1,2,3,5,5
		// 1,2,3,5,null
		// 4개면, 0~3
		// phoneList[3]=phoneList[4];
		// phoneList[3]=null;

	}

}
