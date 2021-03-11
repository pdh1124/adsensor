package generic;

//랩퍼 클래스

//wrapper : 음식 흘리지 않게 싸주는 투명한 비닐. 감싸는 비닐

// 8개의 기본 자료형이 있음
// 상황에 따라서는 참조자료형으로 바꿀 수 있음
// 이때 사용하는것이 wrapper

// wrapper 클래스는 참조자료형을 기본자료형으로, 기본자료형을 참조 자료형으로 바꾸는 것이다.
public class S06랩퍼클래스 {
	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "3.141592", "998" };
		// 문자열 배열. 숫자로 보이지만 모두 문자.
		
		int i = 0;
		
		try {
			for (i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]); //Integer가 wrapper 클래스이다.
				// wrapper class 라고,
				// 원시 타입을 참조 타입으로 변환.
				// 참조 타입 중에서 정수로 변환 가능한 것을 처리.
				System.out.println("숫자로 변환된 값은 " + j);
				
				//이후의 998은 오류가 나온 이후로 뜨지 않는다.
			}
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수	없습니다.");
			// 3.141592 는 정수화 처리 되지 않음.
			// Double.parseDouble 이라는 것을 사용.
		}

	}
}
