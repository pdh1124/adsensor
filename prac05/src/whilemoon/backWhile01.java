package whilemoon;

import java.util.Scanner;

public class backWhile01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A > 0 && B < 10) {
			while (A > 0 && B > 0) {
				System.out.println(A+B);
				A = scan.nextInt();
				B = scan.nextInt();
			}
		} else {
			System.out.println("조건에 맞지 않음");
		}
		
		scan.close();
	}	

}
