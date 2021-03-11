package generic;

//버퍼 : 
//입출력 장치와의 속도 차이를 개선하고자 사용하는 저장 공간.
//버퍼의 크기는 사용자가 지정. 크기에 따라서 장단점 존재.

//버퍼가 너무 클때 

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class S11버퍼 {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;

		try {
			fin = new FileReader("c:\\Tmp\\일일일.txt");// 12345678
			BufferedOutputStream out = new BufferedOutputStream(System.out, 16);
			// 버퍼는 채워지면 출력하고 빈상태로 대기.
			// 출력변수, 글자(버퍼) 크기
			while ((c = fin.read()) != -1) {
				// read()는 파일에 내용이 있다면, 그 내용을 char 단위로 읽어오고,
				// 내용이 없다면 -1을 리턴.
				out.write(c);
			}
			// 엔터로 버퍼 비우기
			new Scanner(System.in).nextLine();// 엔터를 누르기 전까지 대기.
			// = sc.nextLine(); //불필요한 엔터키 소거 역할 코드.

			out.flush(); // 버퍼에 남아 있던 문자 모두 출력(버퍼의 내용을비워라)
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
// 윈도우 업데이트에 따라서 출력 결과가 다를 수 있음
