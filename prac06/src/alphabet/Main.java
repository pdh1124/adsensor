package alphabet;

public class Main {
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		// 배열에 값 할당.
		for (int i = 0; i < alphabets.length; i++, ch++) {//0~25, 26개
			//alphabets[i] = (char)(ch); //대문자
			alphabets[i] = (char)(ch+32); //소문자
		}
		
		// 저장된 배열값 출력.
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int) alphabets[i]);
		}
	}
}
