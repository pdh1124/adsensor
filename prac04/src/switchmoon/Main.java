package switchmoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 성적을 입력받으면 학점을 출력하세요.
		Scanner scan = new Scanner(System.in);
		int a = 0;
		a = scan.nextInt();
//		if (a >= 90) {
//		System.out.println("A");
//		} else if (a >= 80) {
//		System.out.println("B");
//		} else if (a >= 70) {
//		System.out.println("C");
//		} else if (a >= 60) {
//		System.out.println("D");
//		} else {
//		System.out.println("F");
//		} 
//		scan.close();

		//위의 if문을 switch문으로 바꿀 수 있다.
		
		/*
		switch문형식
		switch(조건: 문자, 정수형, 문자열)
		case 1: 수행문
		case 2: 수행문
		break;
		..
		default : 위의 조건들에 걸리지 않는다면, 마지막으로 요 문장을 수행
		무조건 실행해야 하는 부분이 없다면 생략 가능.
		*/
		
		a=a/10; //0~100점까지의 수를 10으로 나누면 0~10까지의 값으로 구분 할 수 있다.
		
		switch(a) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("F등급");
		}
		
		scan.close();
	}

}
