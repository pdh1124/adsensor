package whilemoon;

import java.util.Scanner;

public class backWhile03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt(); // 입력한 값
		int re = x;
		scan.close();

		int aSum = 0; // x의 1의자리수와 sum을 합
		int count = 0; // 더한 횟수

		while (x != re || count == 0) { // x와 aSum이 같을 때

			int xa = x / 10; // 10의 자리 수
			int xb = x % 10; // 1의 자리 수

			int sum = xa + xb; // xa와 xb의 합

			if (sum > 9) { // 두 수의 합이 10이 넘을 경우 10을 삭제
				sum = sum - 10;
			} else {
				sum = sum;
			}
			re = (xb * 10) + sum;
			count += 1;
		}
		System.out.println(count);
	}

}
