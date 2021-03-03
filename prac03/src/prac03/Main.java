package prac03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Car bomCar = new Car(); //참조형 변수를 생성했다. (참조 타입)
		// 카 라는 클래스를 이용하여, 새로운 정보를 메모리에 등록(객체 생성)하고,
		// 등록된 객체를 Car라는 자료형의 변수 bomCar에 저장하라.
		// int a = 10; (기본 타입)
		
		bomCar.setSpeed(10);
		System.out.println("bomCar의 스피드 : " + bomCar.getSpeed());
		
		
		Car butiCar = new Car();
		butiCar.setSpeed(50);
		butiCar.setColor("red");
		System.out.println("butiCar의 스피드 : " + butiCar.getSpeed());
		System.out.println("butiCar의 컬러 : " + butiCar.getColor());
		
		int x = 2;
		System.out.println(<<x);
		
		byte num2 = 10;
		byte num3 = -10;
		System.out.println(~num2);
		System.out.println(~num3);
		
		byte num = 10;
		System.out.println(++num); //11, num = num + 1
		System.out.println(num++); //11, num = num, 그 다음 번에 1증가
		System.out.println(num);
		System.out.println(--num); //11, num = num - 1
		System.out.println(num--); //11, num = num, 그 다음 번에 1감소
		System.out.println(num);
		
		
		int a=10, b=3;
		int c=0;
		
		c = a + b;
		System.out.println(c);
		
		System.out.println(a += b); //13
		// a = a+b;
		System.out.println(a *= b); //39
		// a = a*b;
		
		int d = 9;
		
		if (d == 10) {
			System.out.println("a는 10 이다.");
			
		}else {
			System.out.println("a는 10이 아니다.");
		} // end_if
		
		//if : 만일 ~ 한다면
		
		//if(조건) {
		//	참일때 수행할 문장.	
		//}
		//else {
		//	거짓일때 수행할 문장.
		//}
		
		
		Scanner sic = new Scanner(System.in);
		int e = sic.nextInt();
		
		if(e%2 == 0) {
			System.out.println(e +"는 짝수이다.");
		} else {
			System.out.println(e +"는 홀수이다.");
		}
		
		double f = sic.nextDouble();
		
		if(f%2 == 0) {
			System.out.println(f + "는 짝수이다.");
		} else {
			System.out.println(f + "는 홀수이다.");
		}
		
	}
}
