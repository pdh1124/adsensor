package generic;
 

//Main

public class S06랩퍼클래스의for문변경 {
	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "3.141592", "998" };
		// 문자열 배열. 숫자로 보이지만 모두 문자.

		int i = 0;
		for (i = 0; i < stringNumber.length; i++) {
			try {
				int j = Integer.parseInt(stringNumber[i]); // Integer가 wrapper 클래스이다.
				// wrapper class 라고,
				// 원시 타입을 참조 타입으로 변환.
				// 참조 타입 중에서 정수로 변환 가능한 것을 처리.
				System.out.println("숫자로 변환된 값은 " + j);
			
			} catch (NumberFormatException e) {
				System.out.println(stringNumber[i] + "는 정수로 변환할 수	없습니다.");
				// 3.141592 는 정수화 처리 되지 않음.
				// Double.parseDouble 이라는 것을 사용.
			}
		}
	}
}
