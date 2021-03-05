package acmicpc;

import java.util.Scanner;

public class BackFor06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int sum = N - i;
			System.out.println(sum);
		}
		scan.close();

	}
}
