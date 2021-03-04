package acmicpc;

import java.util.Scanner;

public class BackIfFour {

	public static void main(String[] args) {
		
		//사분면 아래 좌표 확인
		Scanner sic = new Scanner(System.in);
        int x = sic.nextInt();
        int y = sic.nextInt();
        if(x > 0 && y > 0) {
        	System.out.println("1");
        } 
        else if(x < 0 && y > 0) {
        	System.out.println("2");
        }
        else if(x < 0 && y < 0) {
        	System.out.println("3");
        }
        else {
        	System.out.println("4");
        }
		
        sic.close();

	}

}
