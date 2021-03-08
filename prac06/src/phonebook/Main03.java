package phonebook;

import java.util.Scanner;

class PhoneNumb {
	private String name;
	private String phoneNum;
	private String birth;

	public PhoneNumb(String name) {
		this.name = name;
	}

	public PhoneNumb(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public PhoneNumb(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}

	public void showIn() {
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNum);
		if(birth!=null)
			System.out.println("birth: "+birth);
		}

}

class PhoneBookManager    //제어 클래스
{
	final int MAX=100;
	PhoneInfo[] phoneList=new PhoneInfo[MAX];
	int cnt=0;

	void readData()
	{ 
   		cnt++;
	}
	void searchData()
	{
		
	}
	void deleteData()
	{
   		cnt--;
	}
}

public class Main03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("메뉴를 선택하세요.");
		System.out.println("----------------");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.프로그램 종료");
		System.out.println("----------------");

		int a = scan.nextInt();
		boolean x = true;
		while (x) {
			if (a == 1) {
				PhoneNumb p1 = new PhoneNumb("홍길동", "111-2222", "99년 4월 17일생");
				System.out.println("선택:" + a);
				p1.showIn();
				a = scan.nextInt();
				
			} else if (a == 2) {
				
				a = scan.nextInt();			
			} else if (a == 3) {
				
				a = scan.nextInt();
			} else if (a == 4) {
				System.out.println("선택:" + a);
				System.out.println("프로그램이 종료되었습니다.");
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
