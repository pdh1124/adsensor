package IOproject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

//메모장에 직접 입력하고 입력한 내용의 글자수를 읽어주는 것

public class 직접입력 {

	static File file = new File("C:\\Users\\pdw32\\Desktop\\Test.txt"); //파일을 가르

	public static void inputString(String[] args) { // 문장을 메모장에 집어넣을것이 때문에 inputString으로 지정
		try {
			if(file.exists()) { //exists() 존재한다면
				Desktop.getDesktop().edit(file); //edit() 편집하다, 열다
			} else {
				file.createNewFile();
				Desktop.getDesktop().edit(file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // 바탕화면에 파일을 열고 닫고 하는 기능을 제공

	}

}
