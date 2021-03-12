package generic;

// 파일 입출력
// 파일에다가 저장하고 저장된 파일을 출력하는 것

// 크게 문자의 처리와 바이트로 처리 함
// 문자 처리 : 코드표에 의한 문자 처리.
// 바이트 처리 : 문자 처리를 제외한 모든 데이터, 이미지, 사운드, 동영상 등등.

//스트림 : 데이터의 흐름, 
//예) 동영상 스트리밍 서비스 (다운로드 되지 않고, 연결동안만 구동 - 넷플릭스, 웨이브)

import java.io.FileReader; // Reader, Writer 는 문자 처리.
import java.io.IOException;// Input-Output 예외 처리. 운영체제 자원 빌려 사용

public class S09파일입출력 {
	public static void main(String[] args) {
		FileReader fin = null; // = FileReader fin; 선언만 함
		System.out.println("hi5");
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			// fin = new FileReader("c:/windows/system.ini");//결과 동일.
			int c;
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
				// read()는 문자 한개 읽어오기
				// -1은 문자가 없을 때
				System.out.print((char) c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
