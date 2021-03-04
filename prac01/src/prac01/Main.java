package prac01;

public class Main {

	// class : 붕어빵 틀
	// public : 접근 제한자.(공개)
	// private : 접근 제한자. (비공개)

	// 메소드는 메소드명 () 괄호 열고 닫고,
	public static void main(String[] args) {
		// static 정적 메모리 공간에 저장하라.
		// void : 반납하는 값이 없다.
		// String[] : 문자열 배열을 받아서 처리 예정.
		// args : 받아오는 문자열 배열을 변수명 args에 저장.

		// main 이라는 특벼란 메소드 생성. main 후 ctrl + spacebar
		// 메소드란 프로그램의 기능을 담당하는 부분.
		System.out.println("hello world"); // syso 후 ctrl + spacebar
		System.out.println("555555");
		// System : 시스템과 관련된 내용들을 가지고 있는 클래스.
		// out : 정적 변수.
		// println : 출력을 도와주는 메소드.
		// hello world : 출력하고자 하는 문자열.

		// 해석 : 시스템의 출력과 관련해서 println(줄바꿈출력) 메소드 사용.

		
		
		// 변수 사용
		int a = 7;
		// int : 기본 자료형으로 정수값만 저장.(4byte)
		// 정수형 자료형 a에 1을 저장하라.
		// 자료형 : 정수(1byte, 2byte, 4byte, 8byte), 실수, 문자, 문자열, 논리값  
		int b = 5;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		// ctrl + shift + f : 자동 줄맞춤.
		// ctrl + shift + o : 자동 import
		// ctrl + shift + s : 자동 저장
	}

}
