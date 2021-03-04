package acmicpc;

import java.util.Scanner;

public class BackIfThree {

	public static void main(String[] args) {
		
		//윤년 확인하기 (2월 29일 있는 년도)
		Scanner sic = new Scanner(System.in);
        int year = sic.nextInt();
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(1);
        }
        else {
          System.out.println(0);  
        }
		
        sic.close();
		
	}

}
