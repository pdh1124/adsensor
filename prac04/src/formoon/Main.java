package formoon;

public class Main {
	//순환문
	//1 ~ 10 더한 결과를 알려 주세요.
	//1 ~ 10000
	//단순 반복적인 부분을 쉽게 처리해 보자.
	//for, while, do~while, 향상된 for
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<=10;i++) {
			sum += i;
			//sum= sum+0;
			//sum= sum+1;
			//sum= sum+2;
			//sum= sum+3;
			//...
			//sum= sum+10;
			System.out.println(sum);
		}	
		System.out.println(sum);
		
		
//		for(초기값;조건2,증감3) {
//			수행할 문자4
//		}
		
		// 1 >> 2 >> 4 >> 3
		// 2 >> 4 >> 3
		// 2 >> 4 >> 3
		// 2 >> 4 >> 3
		// ...
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			if(i % 2 == 0) {
				System.out.print(" 짝");
			} else {
				System.out.print(" 홀");
			}
			System.out.println();
		}
	}
}
