package acmicpc;

import java.util.Scanner;

public class BackIfOne {

	public static void main(String[] args) {
		
		//A와 B 두수 비교
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        if(A > B) {
            System.out.println(">");
        }else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
        scan.close();
		

	}

}
