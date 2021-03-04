package acmicpc;

import java.util.Scanner;

public class BackIfTwo {

	public static void main(String[] args) {
		
		//등급 확인하기
		Scanner scan = new Scanner(System.in);
        
        int studentScore = scan.nextInt();
                
        if(studentScore >= 90) {
            System.out.println('A');
        } else if(studentScore >= 80) {
            System.out.println('B');
        } else if(studentScore >= 70) {
            System.out.println('C');
        } else if(studentScore >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
        
        scan.close();
		

	}

}
