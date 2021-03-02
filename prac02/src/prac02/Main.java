package prac02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//변수 : 변하는 수
		String s; //String : 참조 자료형
		//변수명은 s
		s = "grape";
		//변수 값
		System.out.println("banana");
		System.out.println(s);
		
		String a, b, c;
		String d;
		String e;
		a = "apple";
		b = "banana";
		c = "Cherry";
		d = "Kiwi";
		e = "pear";
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
		
	
		String[] fruit = {"apple", "banana", "Cherry", "Kiwi", "pear"};
		System.out.println(fruit[2]); System.out.println(Arrays.toString(fruit));
		
		
		int x=3, y=4;
		
		System.out.println(x+y);
		
		
		
		
		
	}
}
