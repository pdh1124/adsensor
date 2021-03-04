package acmicpc;

import java.util.Scanner;

public class BackSwitchOne {

	public static void main(String[] args) {
	
	        Scanner scan = new Scanner(System.in);
	        int A = scan.nextInt();
	        int B = scan.nextInt();
	        
	        int sum;
	        sum = A - B;
	        
	        int result;
	        result = sum >= 0? 1:-1;
	        	        
	        switch(result) {
	        case 1: 
	        	System.out.println("A가 B보다 크거나 같다.");
	        	break;
	        case -1:
	        	System.out.println("B가 A보다 크다.");
	        	break;
	        }
	        scan.close();
	}

}
