package acmicpc;

import java.util.Scanner;

public class BackSwitchTwo {

	public static void main(String[] args) {
		// 성적을 입력받으면 학점을 출력하세요.
		Scanner scan = new Scanner(System.in);
		int a = 0;
		a = scan.nextInt();
		a=a/10;
		
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
