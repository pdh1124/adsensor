package acmicpc;

import java.util.Scanner;

public class BackSwitchFour {

	public static void main(String[] args) {
		
		//사분면 아래 좌표 확인
		Scanner sic = new Scanner(System.in);
        int x = sic.nextInt();
        int y = sic.nextInt();
        
        int c = 4;
        if(x > 0 && y > 0) {
        	c = 1;
        } 
        else if(x < 0 && y > 0) {
        	c = 2;
        }
        else if(x < 0 && y < 0) {
        	c = 3;
        }
       		
        sic.close();
        
        switch(c) {
        case 1:
        	System.out.println(1);
        	break;
        case 2:
        	System.out.println(2);
        	break;
        case 3:
        	System.out.println(3);
        	break;
        default:
        	System.out.println(4);
        	break;	
        }

	}

}
