package prac02;

public class Var {

	public static void main(String[] args) {
		
//		byte (8bit == 1byte)
//		short (2byte)
//		long (8byte)
//		
//		float(4byte)
//		double(8byte)
//		char(1byte)
//		boolean(1byte)
		
		short a = 2, b = 2;		
		long c = 121l, d =24;
		int tmp_int = (int)101;
		
		//명시적 형변환 (개발자가 의도적으로 에러를 무시하게 만듦), 
		//묵시적 형변환 (작은 값을 큰 그릇에 할당)
		byte e = 45, f = 5;
		double g = 24.2, h = 12.5;
		float i = 2.0f,j = 3.2f;
		char ch = 'a';
		boolean t = true;
		boolean l = false;
		
		System.out.println(a + b);
	    System.out.println(c * d);
	    System.out.println(e / f);
	    System.out.println(g + h);
	    System.out.println(i / j);
	    System.out.println(ch);
	    System.out.println(2 < 3);
	    System.out.println(2 > 3);
	    System.out.println(tmp_int);
	    System.out.println(t);

		
	}
}
