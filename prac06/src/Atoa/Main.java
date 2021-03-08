package Atoa;

public class Main {
	public static void main(String[] args) {
		char input = 'A';
		char output;

		output = (char) (input + 32); // 아스키 코드표 상으로 대문자와 소문자 차이는 32.
		// 대문자를 받으면 소문자의 10진 코드값으로 변환하고, 문자로 바꾸어 출력.
		// 문자는 내부적으로 수자값을 갖는다.

//		System.out.println(input + " " + output);
//
//		String toInput = "tomato";
//		char toOutput;
//
//		for (int i = 0; i < toInput.length(); i++) {
//			char a = toInput.charAt(i);
//			System.out.print(a);
//			toOutput = (char) (a + 32);
//			System.out.print(toOutput);
//		}
		
		char InputT = 't';
		char InputO = 'o';
		char InputM = 'm';
		char InputA = 'a';
		char InputT1 = 't';
		char InputO1 = 'o';
		
		char OutputT;
		char OutputO;
		char OutputM;
		char OutputA;
		char OutputT1;
		char OutputO1;
		
		OutputT = (char) (InputT + 32);
		OutputO = (char) (InputO + 32);
		OutputM = (char) (InputM + 32);
		OutputA = (char) (InputA + 32);
		OutputT1 = (char) (InputT1 + 32);
		OutputO1 = (char) (InputO1 + 32);
		
		System.out.print(OutputT);
		System.out.print(OutputO);
		System.out.print(OutputM);
		System.out.print(OutputA);
		System.out.print(OutputT1);
		System.out.print(OutputO1);
	}
}
