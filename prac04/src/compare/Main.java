package compare;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// a,b,c 세 수를 입력받아 비교하여 가장 큰수를 출력하기
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a > b) {
			System.out.println(a + "(이)가 가장 크다.");
		} else if(a > c && a > b) {
			System.out.println(a + "(이)가 가장 크다.");
		} else if(b > c) {
			System.out.println(b + "(이)가 가장 크다.");
		} else {
			System.out.println(c + "(이)가 가장 크다.");
		}
		
		
		scan.close();
		
	}
}
