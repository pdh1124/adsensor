package whilemoon;

import java.util.Scanner;

public class backWhile02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A + B);

		}

		scan.close();
	}

}
