package Atoa;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("소문자로 변환할 대문자 입력 :");
		String input = sc.nextLine();
		String output = "";
		for (int i = 0; i < input.length(); i++) { //length()문자열의 길이를 숫자로 리턴
			int tmp = (int) input.charAt(i); //문자열을 하나씩읽어서 변환하는 과정.
			output += (char) (tmp + 32);
		}
		System.out.println(output);
		sc.close();
	}

}
