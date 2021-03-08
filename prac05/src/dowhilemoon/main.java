package dowhilemoon;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// do~while 무조건 1회는 실행함.

		int dan = 2; // 초기값
		int num = 1;

		do {
			System.out.println(dan + "*" + num + "=" + (dan * num));
			num++;
		} while (num <= 9);

//		Scanner sc = new Scanner(System.in);
//		int b, c;
//
//		do {
//			b = sc.nextInt();
//			c = sc.nextInt();
//			if (b == 0 && c == 0)
//				break;
//			System.out.println(b + c);
//		} while (true);
//
//		sc.close();
	}

}
