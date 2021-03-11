package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

 
//경로에 파일(.txt 파일)을 utf-8타입으로 읽어서 콘솔창 인코딩 타입을 먼저 띄우고 파일에 있는 문자를 띄운다.
public class S10파일입출력 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			// 폴더와 파일 만들고,
			fin = new FileInputStream("c:\\tmp\\일일일.txt"); //파일을 읽어서
			in = new InputStreamReader(fin, "utf-8"); //utf-8타입으로 읽어서
			// in = new InputStreamReader(fin, "ms949"); // 메모장-인코딩 ansi
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding()); // 인코딩 타입을 띄우고
			while ((c = in.read()) != -1) { //문자를 하나씩 받아서
				System.out.print((char) c); //하나씩 띄운다.
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
