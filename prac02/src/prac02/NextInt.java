package prac02;

import java.util.Scanner;

public class NextInt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//화면에서 값을 입력 받겠다.
				
		int a = sc.nextInt(); //1번째 입력값을 int 로 저장.
		int b = sc.nextInt(); //2번째 입력값을 int 로 저장.
		System.out.println(a + b);
		
		sc.close(); //운영체제에서 입력에 대한 자원을 다 썻으니 반납.
		
	}
}
