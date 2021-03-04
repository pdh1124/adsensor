package acmicpc;

import java.util.Scanner;

public class BackFor01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum;
		for(int i=1;i<10;i++) {
			sum = N*i;
			System.out.println(N + " * " + i + " = " + sum);
		}
		
		scan.close();
	}
}
