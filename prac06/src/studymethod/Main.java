package studymethod;

public class Main {
	public static void main(String[] args) {

		int num1 = 1, num2 = 2;
		System.out.println(add(num1, num2));
		num1++;
		num2++;
		System.out.println(add(num1, num2));
		// ... num1=100, num2=101
		num1++;
		num2++;
		System.out.println(add(num1, num2));
	} // end of main
		// 접근제한자public static 특별한 예약어.
		// int 리턴 타입(함수 처리결과의 자료형)
		// (값1,값2...) arguments, 매개변수, 전달받을 값의 자료형과
		// 변수명 표기.

	public static int add(int num1, int num2) {
		// 매개변수명은 호출하는 곳은 변수명과 일치할 필요 없음.
		// 중요한것은 자료형과 순서.
		return num1 + num2;
	}
	// 반복되는 작업을 함수(메서드)로 단순화.
	// 필요시 반복 호출.

} // end of class
