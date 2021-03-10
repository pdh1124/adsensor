package casting;

public class Casting {

	public static void main(String[] args) {
		
		int num = 10;
		byte b;
		
		b = (byte)num; //명시적 형변환, 캐스팅(casting)
		System.out.println(b);
		
		num = b; //묵시적 형변환.
		System.out.println(num);
		//참조 자료형도 형변환이 가능하다. 뭐가 더 큰지?
		// 부모 자료형 변수에 = 자식 자료형 변수를 담으려면 (묵시적 형변환 가능)
		// 자식 자료형 변수에 = 부모 자료형 변수를 담으려면 (명시적 형변환 가능(무조건이지 않음))
		
		
		// 형변환 에서는 부모가 자식보다 큰 개념.
		// 하지만 자식은 부모보다 기능면은 더 많다. (자식이 부모의 기능을 가져오기 때문에 부모가 2개를 가지면 자식은 2+a가 되기 때문에)
		// 자식 객체를 구현하기 위해서는 부모객체부터 만들어 져야 한다.
		// (계란의 노른자가 부모, 흰자가 자식)
		
	}

}
