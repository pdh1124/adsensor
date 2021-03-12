package generic;

//메소드의 전달인자로 배열 전달 예제

public class S04메소드의전달인자로배열전달예제 {
	public static void mymethod(int[] b) {
		// 넘겨받는 메소드에서는 배열을 선언하듯이 표시.
		for (int i = 0; i < 4; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };// 배열의 선언과 초기화.
		mymethod(arr);// 스테틱 메소드 호출(전달인자는 배열명)
	}
}
