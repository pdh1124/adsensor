package acmicpc;

import java.util.Scanner;

public class BackSwitchFive {

	public static void main(String[] args) {
		
		//현재시간에 45분 먼저 알람 맞추기
		Scanner sic = new Scanner(System.in);
        int H = sic.nextInt();
        int M = sic.nextInt();
        
        //1번째 방법
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
        
        //2번째 방법
//        if((H == 0) && (M < 45)) {
//        	H = 23;
//        	M += 60;
//        } else if(M < 45) {
//        	H -= 1;
//        	M += 60;
//        }
//        System.out.println(H + " " + (M - 45));
        
        
        sic.close();
	}

}
