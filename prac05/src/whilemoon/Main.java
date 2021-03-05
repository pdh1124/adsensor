package whilemoon;

public class Main {

	public static void main(String[] args) {
		
		//초기값, 조건, 증감, 몸체
		//for (초기값, 조건, 증감){몸체}
		
		
		int num = 0;
		while(num < 10) {
			System.out.println("hello~");
			num++;
		}
		
		
		//초기값,
		//while(조건) {몸체,증감}
		
		// 2~9단 까지 모두 보이기.
	      int dan = 2;// 초기값.
	      int number;

	      while (dan <= 9) {
	         number = 1;
	         while (number <= 9) {
	            System.out.println(dan + "*" + number + "=" + (dan * number));
	            number++;
	         }
	         System.out.println();
	         dan++;

	      }
	}

}
