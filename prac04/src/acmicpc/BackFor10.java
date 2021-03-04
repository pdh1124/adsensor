package acmicpc;

import java.util.Scanner;

public class BackFor10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 1; i <= T; i++) {
			for(int j = 0; T-j > i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
