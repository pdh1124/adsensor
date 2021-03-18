package IOproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 파일을읽어서문자를가져옴 { // FileReadChar : 파일을읽어서문자를가져옴

	public static void countChar(String[] args) { // 캐릭터를 세는것이기 때문에 countChar로 지정함
		// 글자를 읽어들이기 위해 변수 3개가 필요
		int charChar = 0; // 글자를 읽어들이기 위한 변수
		int charCnt = 0; // 글자의 갯수(스페이스 포함)
		int spaceCnt = 0; // 공백의 갯수(스페이스 갯수)

		try {
			FileReader filereader = new FileReader("C:\\\\Users\\\\pdw32\\\\Desktop\\\\Test.txt");
			// 파일을 읽어오는것이기 때문에 FileReader라는 클래스를 사용
			while ((charChar = filereader.read()) != -1) {
				// filereader가 파일을 읽어서(read()) 아스키코드(정수형으로) 읽어서
				// charChar변수에다가 집어넣게 되는데 파일이 끝날때까지 반복(!= -1)
				if (charChar == 32) { // charChar에 스페이스(아스키코드로 스페이스는 32임)가 들어간다면
					spaceCnt++; // 스페이스카운트를 1개씩 올림
				}
				if (charChar != 32) { // charChar에 스페이스(아스키코드로 스페이스는 32임)가 아닌 모든 글자가 들어간다면
					charCnt++; // 글자 갯수의 카운트를 1개씩 올림
				}
			}
			filereader.close(); // 파일
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("잘못된 입출력입니다.");
			
		}
		
		
		System.out.print("\r 파일 속 공백 숫자는 : " + spaceCnt);
		System.out.print("\r 파일 속 공백을 제외한 문자의 숫자는 : " + charCnt);
		System.out.print("\r 파일 속 공백을 포함한 문자의 숫자는 : " + (spaceCnt + charCnt));
		
	}
}
