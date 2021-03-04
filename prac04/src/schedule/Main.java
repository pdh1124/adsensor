package schedule;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//문제) 오늘 아침에 수업 준비 전까지 발생된 일들을 다중 if문을 이용하여 표시해 보세요.
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a == 1) {
			 System.out.println("8시에 기상한다.");
			 int b = scan.nextInt();
			 if(b == 1) {
				 System.out.println("아침을 먹는다.");
				 int d = scan.nextInt();
				 if(d == 1) {
					 System.out.println("일어나 강의에 참여한다.");
				 } else {
					 System.out.println("지각을 한다.");
				 }
			 }else {
				 System.out.println("아침을 굶는다.");
				 int d = scan.nextInt();
				 if(d == 1) {
					 System.out.println("일어나 강의에 참여한다.");
				 } else {
					 System.out.println("지각을 한다.");
				 }
			 }
		 } else {
			 System.out.println("조금만 더 잔다.");
			 System.out.println("알람을 맞춰 둔다.");
			 int c = scan.nextInt();
			 if(c == 1) {
				 System.out.println("일어나 강의에 참여한다.");
			 } else {
				 System.out.println("지각을 한다.");
			 }
		 }
		 
		 scan.close();
		 
		 //if(조건) 참;
		 //if(조건) 참 else 거짓
		 //if(조건) 참 else if(조건) 참 else 거짓
		 //if(조건) {if(조건)참}
	}

}
