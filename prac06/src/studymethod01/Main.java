package studymethod01;

public class Main {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 12;
		int num3 = 15;
		int num4 = 8;
		int num5 = 6;
		int num6 = 4;
		int num7 = 30;
		int num8 = 3;
		int num9 = 30;
		int num10 = 4;
		System.out.println(add(num1, num2));
		System.out.println(minus(num3, num4));
		System.out.println(multiply(num5, num6));
		System.out.println(division(num7, num8));
		System.out.println(Remainder(num9, num10));
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num3, int num4) {
		return num3 - num4;
	}

	public static int multiply(int num5, int num6) {
		return num5 * num6;
	}

	public static int division(int num7, int num8) {
		return num7 / num8;
	}
	
	public static int Remainder(int num9, int num10) {
		return num9 % num10;
	}
}
