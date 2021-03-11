package generic;

//지역변수 초기화.
public class S07지역변수의초기화 {
	int ii;

	public static void main(String[] args) {
		
		String[] stringNumber = { "23", "12", "3.141592", "998" };
		// 문자열 배열. 숫자로 보이지만 모두 문자.
		
		//int i; 로만 됐을 경우 지역변수의 초기값을 갖고 있지 않음.
		int i = 0;// 지역변수, 내부적 0. 
		
		S07지역변수의초기화 m = new S07지역변수의초기화();
		
		System.out.println("i=" + i); // 지역변수는 선언과 동시에 초기값을 갖지않음.
		System.out.println("ii=" + m.ii); // static 변수는 선언과 동시에초기값 가짐.
		// 자바1권, 95 페이지를 참조해 보면,
		// 클래스의 인스턴스 변수들은 자동 초기화 되지만,
		// 메소드 내의 선언된 변수는 자동 초기화 되지 않음.
		try {
			for (i = 0; i < stringNumber.length; i++) { //for문 안에서는 초기화가 되지만 for문을 벗어날 경우 i는 초기값을 갖지 못함
				int j = Integer.parseInt(stringNumber[i]);
				// wrapper class 라고,
				// 원시 타입을 참조 타입으로 변환.
				// 참조 타입 중에서 정수로 변환 가능한 것을 처리.
				System.out.println("숫자로 변환된 값은 " + j);
			}
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수없습니다.");
			// 3.141592 는 정수화 처리 되지 않음.
			// Double.parseDouble 이라는 것을 사용
		}
	}
}
		
		// static 변수나 클래스 공유 변수는 자동 초기화 되지만,
		// 메소드 내부 변수는 자동 초기화 되지 않음