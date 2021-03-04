package acmicpc;

import java.util.Scanner;

public class BackIfFive {

	public static void main(String[] args) {
		
		//현재시간에 45분 먼저 알람 맞추기
		Scanner sic = new Scanner(System.in);
        int H = sic.nextInt();
        int M = sic.nextInt();
        
        if(M < 45) {
        	H--;
        	M = 60-(45-M);
        	if(H < 0) {
        		H = 23;
        	}
        	System.out.println(H + " " + M);
        } else {
        	M = M - 45;
        	System.out.println(H + " " + M);
        }
        
        sic.close();
	}

}
