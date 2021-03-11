package generic;

import java.util.Scanner;


//예외처리에 대한 문구 try-catch
//예외 : 예상하지 못한 상황.
public class S05예외처리try_catch문 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("나뉨수를 입력하시오:");
			int dividend = scanner.nextInt(); // 나뉨수 입력
			
			System.out.print("나눗수를 입력하시오:");
			int divisor = scanner.nextInt(); // 나눗수 입력
			
			try { //오류가 날거 같은 내용
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
				break; // 정상적인 나누기 완료 후 while 벗어나기
			} catch (ArithmeticException e) { //오류가 났을 때 띄울 내용 
				// ArithmeticException 예외 처리 코드
				// System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
				e.printStackTrace(); 
				// 컴파일러가 제공하는 오류 메세지.
				// 줄번호를 클릭하면 오류 내용으로 이동.
				// 많이 발생되는 에러는 10개 정도이므로, 개인적으로 내용정리 바람.
			}
		}
		scanner.close();
	}
}
