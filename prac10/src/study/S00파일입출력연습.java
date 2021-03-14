package study;

import java.io.FileOutputStream;
import java.io.IOException;

public class S00파일입출력연습 {
	public static void main(String[] args) throws IOException {

		FileOutputStream newFile = new FileOutputStream("c:\\tmp\\test.txt");
		
		for(int i=1; i<=20; i++) {
			String txt = i + "번 쓰고 있다.\n";
			newFile.write(txt.getBytes());
		}
		newFile.close();
	}
}
