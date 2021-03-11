package generic;

//파일 관리.

import java.io.File;
import java.io.IOException;

public class S12파일관리 {
   public static void listDirectory(File dir) {
      System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");
      File[] subFiles = dir.listFiles();
      // listFiles : 폴더의 정보를 읽어와서 배열로 리턴.
      for (int i = 0; i < subFiles.length; i++) {
         File f = subFiles[i];
         long t = f.lastModified();
         System.out.print(f.getName());
         System.out.print("\t파일 크기: " + f.length());
         System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
      }
   }

   public static void main(String[] args) {
      File f1 = new File("c:\\windows\\system.ini");
      // system.ini 를 읽어서 파일 객체 생성
      System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
      // 경로, 부모 폴더, 파일 이름.
      String res = "";
      if (f1.isFile())// 파일인지 확인.
         res = "파일";
      else if (f1.isDirectory())// 폴더 인지 확인
         res = "디렉토리";
      System.out.println(f1.getPath() + "은 " + res + "입니다.");

      File f3 = new File("c:\\tmp");// 중간 폴더 없으면 오류.
      if (!f3.exists()) { //해당 내용이 존재 하지 않는다면,
         f3.mkdir(); // 해당 정보를 생성해라. 
      }

      File f2 = new File("c:\\tmp\\java_sample");
      // 만든적 없는 파일 정보로 객체 생성.
      if (!f2.exists()) {// 해당 내용이 존재하지 않는다면,
         // f2.mkdir(); // 존재하지 않으면 디렉토리 생성
         // make directory 폴더 생성.
         try {
            f2.createNewFile();// 파일 생성.
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