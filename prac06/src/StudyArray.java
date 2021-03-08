
public class StudyArray {

	public static void main(String[] args) {
		// 배열 : 자료형(타입)이 같고, 연속적인 값들.

		int a = 1;
		int b = 2;
		// .....
		int z = 26;

		int[] intNum1 = new int[26]; // 변수 26개를 만들었다. 내부 순서를 0~25개, 26개의 방을 생성
		int intNum2[] = new int[26]; // 배열의 선언과 할당.
		int intNum3[]; // 배열 선언만 처리.
		// 배열은 참조 자료형이다.

		// for
		for (int i = 0; i < intNum1.length; i++) {
			intNum1[i] = i + 1;
			System.out.println(intNum1[i]);
		}

		int[] intNum4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26 };

		// 향상된 for
		for (int tmp : intNum4) {
			System.out.println("향상 for " + tmp);
		}

	}

}
