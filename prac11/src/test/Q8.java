package test;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		String a = scan.nextLine();
		char[] b = a.toCharArray();
		
		for(int i=0; i<b.length; i++) {
			if(b[i] >= 'a' && b[i] <= 'z') {
				b[i] = (char)(b[i]-32);
			}
		}
		System.out.println(b);
	}

}
