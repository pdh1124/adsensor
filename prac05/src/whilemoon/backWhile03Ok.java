package whilemoon;

import java.util.Scanner;

public class backWhile03Ok {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); // 입력한 값
		int re = x; //사용자가 입력한 값으로 초기화
		int count = 0; // 더한 횟수

		while (x != re || count == 0) { 
			// 처음 입력한 값과 나중의 결과값이 같지 않다면 순환.
			// 이거나 순환 횟수가 0이라면 화일문 동작.
			re = (re%10)*10 + ((re/10) + (re%10)) % 10;
			count++;
		}
		System.out.println(count);
		scan.close();
	}

}
