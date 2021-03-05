package acmicpc;

import java.util.Scanner;

public class BackFor07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int sum = A + B;
			System.out.println("Case #" + i + ": " + sum);
		}

		scan.close();

	}
}
