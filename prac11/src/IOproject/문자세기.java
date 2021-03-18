package IOproject;

import java.util.Scanner;

public class 문자세기 { //문자를 세기 위해 CharCounter로 지정

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메모장에 자소서를 입력하시면 글자수를 세어줍니다.");
		System.out.println("입력이 끝나면 저장하시고 창을 닫아주세요.");
		
		직접입력.inputString(args); //실행을 하면 메모장이 열리고 저장하기를 누르고 창을 닫으면 됨
		
		System.out.println("글자수를 세어드릴까요? 숫자 1을 눌러주세요.");
		int yes = scan.nextInt();
		
		if(yes == 1) {
			파일을읽어서문자를가져옴.countChar(args);
		} else {
			System.out.println("숫자 1을 누르지 않아서 종료됩니다.");
		}
		scan.close();
	
	}

}
