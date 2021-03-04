package acmicpc;

import java.util.Scanner;

public class BackSwitchThree {

	public static void main(String[] args) {
		
		//윤년 확인하기 (2월 29일 있는 년도)
		Scanner sic = new Scanner(System.in);
        int year = sic.nextInt();
        
        int yearFour = year % 4;
        int YFX = year % 100;
        int YFY = year % 400;
        
        switch(yearFour) {
        case 0: 
        	switch(YFX) {
        	case 0:
        		System.out.println(0);
        		break;
        	}
        	switch(YFY) {
        	case 0:
        		System.out.println(1);
        		break;
        	}
        	break;
        default:
        	System.out.println(0);
        }    
	
        sic.close();
	}

}
