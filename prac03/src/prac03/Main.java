package prac03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Car bomCar = new Car(); //������ ������ �����ߴ�. (���� Ÿ��)
		// ī ��� Ŭ������ �̿��Ͽ�, ���ο� ������ �޸𸮿� ���(��ü ����)�ϰ�,
		// ��ϵ� ��ü�� Car��� �ڷ����� ���� bomCar�� �����϶�.
		// int a = 10; (�⺻ Ÿ��)
		
		bomCar.setSpeed(10);
		System.out.println("bomCar�� ���ǵ� : " + bomCar.getSpeed());
		
		
		Car butiCar = new Car();
		butiCar.setSpeed(50);
		butiCar.setColor("red");
		System.out.println("butiCar�� ���ǵ� : " + butiCar.getSpeed());
		System.out.println("butiCar�� �÷� : " + butiCar.getColor());
		
		int x = 2;
		System.out.println(<<x);
		
		byte num2 = 10;
		byte num3 = -10;
		System.out.println(~num2);
		System.out.println(~num3);
		
		byte num = 10;
		System.out.println(++num); //11, num = num + 1
		System.out.println(num++); //11, num = num, �� ���� ���� 1����
		System.out.println(num);
		System.out.println(--num); //11, num = num - 1
		System.out.println(num--); //11, num = num, �� ���� ���� 1����
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
			System.out.println("a�� 10 �̴�.");
			
		}else {
			System.out.println("a�� 10�� �ƴϴ�.");
		} // end_if
		
		//if : ���� ~ �Ѵٸ�
		
		//if(����) {
		//	���϶� ������ ����.	
		//}
		//else {
		//	�����϶� ������ ����.
		//}
		
		
		Scanner sic = new Scanner(System.in);
		int e = sic.nextInt();
		
		if(e%2 == 0) {
			System.out.println(e +"�� ¦���̴�.");
		} else {
			System.out.println(e +"�� Ȧ���̴�.");
		}
		
		double f = sic.nextDouble();
		
		if(f%2 == 0) {
			System.out.println(f + "�� ¦���̴�.");
		} else {
			System.out.println(f + "�� Ȧ���̴�.");
		}
		
	}
}
