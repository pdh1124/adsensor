package generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class PhoneInfo {
	// 생성자 역할 : 객체를 초기화. 클래스를 통해서 동일한 형식의 객체 생성.
	// int a=5; 정수형 변수a를 5로 초기화.
	// 객체와 클래스의 차이 : 붕어빵과 붕어빵틀.
	// 생성자 특징 : 리턴 타입이 없다.
	// (매개변수가 없는) 기본 생성자 명시하지 않는다면 컴파일러가자동생성.
	// 생성자의 이름은 클래스명과 같다.

	private String name;
	private String phoneNumber;

	// 생성자 생성
	public PhoneInfo() {
	}

	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// 출력 메소드
	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

} // PhoneInfo 끝

//대학 친구 전화번호
class PhoneUnivInfo extends PhoneInfo {
	String major;
	int year;

	// 생성자 생성

	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	// 출력 메소드
	@Override
	public void showInfo() {
		System.out.println("name: " + super.getName());
		System.out.println("phone: " + super.getPhoneNumber());
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
}

//회사 전화번호
class PhoneCompanyInfo extends PhoneInfo {
	String company;

	// 생성자 생성
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	// 출력 메소드
	@Override
	public void showInfo() {
		System.out.println("name: " + super.getName());
		System.out.println("phone: " + super.getPhoneNumber());
		System.out.println("company: " + company);
	}
}

class Menu {
	static void showMenu() {
		// 객체 생성 없이 호출할 수 있다.
		// 클래스명.showMenu();
		// 1. 2.... 3..
		System.out.println("메뉴를 선택하세요.");
		System.out.println("---------------");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 전체 출력");
		System.out.println("5. 데이터 종료");
		System.out.println("---------------");
		// 안내 메세지의 역할.
		// 클래스 분리와 static 의 사용을 연습.
	}
}

class PhoneBookManager {
	
	/*
	final int MAX = 100; // 100개의 메모리를 가진 배열을 만들겠다.
	// final은 변수(변하는 값)를 상수(변하지 않는 값)로 만들어 준다는것
	PhoneInfo[] phoneList = new PhoneInfo[MAX];
	*/
	
	//PhoneInfo[] phoneList = new PhoneInfo[MAX];을 수정
	HashSet<PhoneInfo> phoneList = new HashSet<>();
	//import java.util.HashSet;를 함
	
	int cnt = 0;
	// 100개 중에 몇개를 입력했는지 횟수 확인.

	// 입력 기능
	void readData() {
		System.out.println("데이터를 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		int readInput = Phone.sc.nextInt();

		if (readInput == 1) {
			Phone.sc.nextLine();
			System.out.print("이름 :");
			String name = Phone.sc.nextLine();
			System.out.print("연락처 :");
			String PhoneNumber = Phone.sc.nextLine();

			PhoneInfo people = new PhoneInfo(name, PhoneNumber);
			// 전달값 3개를 처리하는 생성자가 없으므로 에러,
			// 해당 에러 위에 커서를 두면,
			// 선택1) 지워라.
			// 선택2) 해당 생성자를 만들어라.
			
			/*
			phoneList[cnt] = people;
			cnt++;
			*/
			
			//phoneList[cnt] = people;를 add로 추가시키는 것으로 변경
			//cot++을 할 필요 없이 HashSet이 알아서 늘려준다.
			phoneList.add(people);
			
			
			
			System.out.println("입력이 완료되었습니다. \n");
		}

		else if (readInput == 2) {
			Phone.sc.nextLine();
			System.out.print("이름 :");
			String name = Phone.sc.nextLine();
			System.out.print("연락처 :");
			String PhoneNumber = Phone.sc.nextLine();
			System.out.print("전공 :");
			String major = Phone.sc.nextLine();
			System.out.print("학년 :");
			int year = Phone.sc.nextInt();

			PhoneInfo people = new PhoneUnivInfo(name, PhoneNumber, major, year);
			// 전달값 3개를 처리하는 생성자가 없으므로 에러,
			// 해당 에러 위에 커서를 두면,
			// 선택1) 지워라.
			// 선택2) 해당 생성자를 만들어라.
			
			/*
			phoneList[cnt] = people;
			cnt++;
			*/
			
			//phoneList[cnt] = people;를 add로 추가시키는 것으로 변경
			//cot++을 할 필요 없이 HashSet이 알아서 늘려준다.
			phoneList.add(people);
		}

		else if (readInput == 3) {
			Phone.sc.nextLine();
			System.out.print("이름 :");
			String name = Phone.sc.nextLine();
			System.out.print("연락처 :");
			String PhoneNumber = Phone.sc.nextLine();
			System.out.print("회사 :");
			String company = Phone.sc.nextLine();

			PhoneInfo people = new PhoneCompanyInfo(name, PhoneNumber, company);
			// 전달값 3개를 처리하는 생성자가 없으므로 에러,
			// 해당 에러 위에 커서를 두면,
			// 선택1) 지워라.
			// 선택2) 해당 생성자를 만들어라.
			
			/*
			phoneList[cnt] = people;
			cnt++;
			*/
			
			//phoneList[cnt] = people;를 add로 추가시키는 것으로 변경
			//cot++을 할 필요 없이 HashSet이 알아서 늘려준다.
			phoneList.add(people);
		}

		else {
			System.out.println("적절한 값이 아닙니다.");
		}

	}
	
	
	// 검색과 삭제 기능을 위한 메소드(입력한 이름과 배열에 있는 이름이 같을 때 몇번째인지 알아보는)
		/* int searchIndex(String name) { */
		PhoneInfo searchIndex(String name) {
			int index = 200; // 객체 배열의 인덱스가 0~99 => MAX가 100이기 때문
			// 검색 실패시 index의 기본값을 리턴 하므로, 범위에 없는 값 설정.
			/*
			for (int i = 0; i < cnt; i++) {
				// cnt번째 갯수까지 배열을 찾아본다.
				// cnt를 사용하는 이유 : 연락처 등록은 1~100건 가능.
				// 몇건을 입력했는지 모르므로 입력된 갯수 사용.
				// phoneList.length 는 항상 100.
				if (name.equals(phoneList[i].getName())) {
					// equals는 객체와 객체가 같은 것인지 비교하는 API.
					// 객체 간에 같고 다름은 필요에 따라서 달라질 수 있기 때문이다.
					// name과 phoneList[i].getName()를 비교해서 같으면 true

					// name 으로 연락처 객체에 접근하지 않는 이유는,
					// 사용자 요청이 해당 값을 private 으로 요구했기 때문에.
					// 직접 접근해서 사용할 수 없고,
					// public 한 메소드를 통해서 값을 읽어 올 수 있음. - 자바의 캡슐화.
					// getter : private 한 값 읽어 오기.
					// setter : private 한 값 저장 하기.
					index = i;
				}
				// cnt번째까지 한바퀴 다 도는데
				// if문에서 맞는 i값을 index로 따로 저장했기 때문에
				// 이후에는 계속 돌지만 index값을 따로 빼놨기 때문에
				// 해당 name이 값은 값의 i를 return함

				// 예를 들어 총 10개의 리스트가 있는데 그중 3번째를 검색하면
				// 총 10번의 for문을 돌지만 if문의 name과 phoneList[i].getName()을 비교하여
				// 3번째가 같을때의 i값을 index로 따로 빼온다.
			}
			return index;
			*/
			
			Iterator<PhoneInfo> iter = phoneList.iterator(); 
			//1회성
			
			while(iter.hasNext()) { //hasNext는 조건에 대한 부분으로 다음에 가르킬 요소가 있느냐 없느냐. (true false)
				PhoneInfo people = iter.next(); //next는 값을 전부 가지고 옴
				if(name.equals(people.getName())) { //equals는 name과 pi의 getName을 비교함.
					return people;
				}
			}
			
			return null; //값이 없다면 null로 가져옴

		}

	// 검색
	void searchData() {
		// 똑같은 이름의 연락처는 없다가 전제. => HashCat으로 넘어오면서 중복을 없애줌
		// 이름을 입력 받으면, 이름을 등록된 연락처에서 검색후,
		// 있다면, 연락처 표시.
		// 없다면, 찾는 연락처 없음 표시.
		System.out.println("데이터 검색을 시작합니다.");
		Phone.sc.nextLine();// 엔터값 제거
		System.out.print("이름 :");
		String name = Phone.sc.nextLine();
		/*
		int a = searchIndex(name);
		System.out.println(a + "번째 값을 찾았습니다.");

		if (a != 200) { // name이 몇번째 값인지 찾았다면
			phoneList[a].showInfo(); // a번째 배열을 보여줘라
		} else {
			System.out.println("찾는 값이 존재하지 않습니다. \n");
		}
		*/
		
		PhoneInfo people = searchIndex(name);
		
		if(people != null) {
			people.showInfo();
		}
	}

	

	// 삭제
	void deleteData() { // 삭제 처리 메소드
		// 일치하는 값 찾기.
		// 찾는 값 삭제.
		// 0,1,2,3,4 상황에서 3번 삭제.
		// 0,1,2,null,4 컴파일러는 순차적 접근하면서 널포인트 에러 발생 시킴.
		// 0,1,2,4 뒤쪽에 값을 삭제한 자리로 당겨오기.
		// 위처럼 변경해야 삭제 이후에도 검색 가능.

		System.out.println("데이터 삭제를 시작합니다...");
		Phone.sc.nextLine();
		System.out.println("이름 :");
		String name = Phone.sc.nextLine();
		/*
		int a = searchIndex(name);

		if (a != 200) { // 찾는 name 값이 있다면
			arrSort(a);
			System.out.println(a + "번째 데이터가 삭제 되었습니다.");
			cnt--;
		} else {
			System.out.println("찾는 값이 없습니다.");
		}
		System.out.println("현재 등록된 연락처:" + cnt + "\n");
		*/
		
		Iterator<PhoneInfo> iter = phoneList.iterator(); 
		//1회성
		
		while(iter.hasNext()) { //hasNext는 조건에 대한 부분으로 다음에 가르킬 요소가 있느냐 없느냐. (true false)
			PhoneInfo people = iter.next(); //next는 값을 전부 가지고 옴
			if(name.equals(people.getName())) { //equals는 name과 pi의 getName을 비교함.
				phoneList.remove(people);
			}
		}
		
	}	
	
	/* 
	// 삭제시키는 메소드
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
	*/
	
	// 전체 리스트 출력
	void listPrint() {
		/*
		for (int i = 0; i < cnt; i++) {
			phoneList[i].showInfo();
			System.out.println();
		}
		*/
		Iterator<PhoneInfo> iter = phoneList.iterator();
		// 1회성.
		while(iter.hasNext()) {
			iter.next().showInfo();
		}
	}
}

public class Phone {

	static Scanner sc = new Scanner(System.in);
	//static은 프로그램 시작시 특정 메모리 공간에 저장이 되고,
	//프로그램 끝날때 까지 유지됨
	//공유의 성격으로 남용하면 객체지향의 장점이 줄어듬.
	//Scanner에 static을 쓰는 이유는 모든 class마다 다 Scanner를 주기 보다는
	//모든 클래스에 공유를 해 사용하는게 편하기 때문
	
	
	
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();

		// 메소드 안에 선언한 변수는 메소드가 끝나면 사라짐. 사용 불가.
		// 공유 변수는 메소드 바깥쪽, 클래스 안쪽에 선언. 여러 메소드에서 해당 변수를 공유.

		while (true) {
			Menu.showMenu();
			// 1,2,3,4 안내문 호출
			// Menu 클래스의 showMenu 메소드 호출.
			// 객체 생성후 접근이 아니다.
			// 메뉴를 반복 표시하면서, 선택에 따라 처리를 분기.

			int input = sc.nextInt();
			// 1,2,3,4 안내문에 있는 선택사항을 콘솔창에 칠것이다.

			if (input == 1) { // 입력할때
				manager.readData();
			} else if (input == 2) {// 검색할때
				manager.searchData();
			} else if (input == 3) {// 삭제할때
				manager.deleteData();
			} else if (input == 4) {// 모두 출력할때
				manager.listPrint();
			} else {
				break;
			}
		}
		sc.close();
	}
}
