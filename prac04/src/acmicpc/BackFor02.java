package acmicpc;

import java.util.Scanner;

public class BackFor02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
		int A = scan.nextInt();
		int B = scan.nextInt();
		int sum = A + B;
		System.out.println(sum);
		}
		scan.close();
	}
}