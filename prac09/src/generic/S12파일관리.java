package generic;

//파일 관리.

import java.io.File;
import java.io.IOException;

public class S12파일관리 {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----"); // getPath():입력된 경로 출력
		
		
		//파일의 이름과 크기와 수정한 시간을 순서대로 출력
		File[] subFiles = dir.listFiles();
		// listFiles : 폴더의 정보를 읽어와서 배열로 리턴.
		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified(); // lastModified() : 해당 경로 파일의 최종 수정 일자를 반환한다. 
			System.out.print(f.getName());
			System.out.print("\t파일 크기: " + f.length()); // length() : 해당 경로 파일의 길이를 반환한다. 
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
			//%tb : 월
			//%td : 일
			//%ta : 요일
			//%tT : 시간
			//t를 4번 넣는 이유는 월,일,요일, 시간의 값을 각각 가져와야하기 때문
			
		}
	}

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		// system.ini 를 읽어서 파일 객체 생성
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		// getPath() : 파일의 경로를 문자열의 형태로 리턴한다.
		// getParent() : 부모 경로에 대한 경로명을 문자열로 넘겨준다.
		// getName() : 파일이나 폴더의 이름을 넘겨준다.
		
		String res = "";
		if (f1.isFile()) {// 파일인지 확인.
			res = "파일";
		} else if (f1.isDirectory()) {// 폴더 인지 확인
			res = "디렉토리";
		}
		System.out.println(f1.getPath() + "은 " + res + "입니다.");

		File f3 = new File("c:\\tmp");// 중간 폴더 없으면 오류.
		if (!f3.exists()) { // exists() : 파일의 존재 여부를 리턴한다. 해당 내용이 존재 하지 않는다면,
			f3.mkdir(); // mkdir() : 해당 경로에 폴더를 만든다. 해당 정보를 생성해라.
		}

		File f2 = new File("c:\\tmp\\java_sample");
		// 만든적 없는 파일 정보로 객체 생성.
		if (!f2.exists()) {// 해당 내용이 존재하지 않는다면,
			// f2.mkdir(); // 존재하지 않으면 디렉토리 생성
			// make directory 폴더 생성.
			try {
				f2.createNewFile();// createNewFile() : 주어진 이름의 파일이 없으면 새로 생성한다.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		listDirectory(new File("c:\\tmp"));
		f2.renameTo(new File("c:\\tmp\\javasample"));
		listDirectory(new File("c:\\tmp"));
	}
}