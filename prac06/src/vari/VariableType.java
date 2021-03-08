package vari;


public class VariableType {
	
	static int tmp; //전역 변수.
	// static : 정적 변수, 프로그램 전체에서 공유하는 값.
	// 남용의 경우, 객체 지향 특징을 저하시킴. 
	
	public static void main(String[] args) {
		int i = 0;
		
		while(true) {
			System.out.print(i++);
			if(i > 10) {
				break;
			}
			int j = 2; //지역변수. while문 안에서만 사용가능 localvariable
			System.out.println(" " + j);
		}
		
		System.out.println("\n");
		System.out.println("tmp : " + tmp); 
		//i같은 경우 int i;만으로 변수값을 할당하지 않을때는 사용 하지 못하지만
		//static 변수는 값을 할당하지 않으면 기본값으로 자동 초기화
		
		System.out.println(i);
		//System.out.println(j); j가 실행이 안됨
	}


}
