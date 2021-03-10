package study;

class parents {

	public void alphabet() {
		
		System.out.println("a"); 
		System.out.println("b");
		System.out.println("c");
		System.out.println("d");
        System.out.println("e");
        System.out.println("f");
        System.out.println("g");
        System.out.println("h");
        System.out.println("i");
        //...
        System.out.println("z");
	}
}

//

class child extends parents {

	@Override
public void alphabet() {
		//a,b,c만 대문자로 바꾸고 싶다.
		System.out.println("A"); 
		System.out.println("B");
		System.out.println("C");
		
		//나머지 항목을 굳이 써야 하는지
		System.out.println("d");
        System.out.println("e");
        System.out.println("f");
        System.out.println("g");
        System.out.println("h");
        System.out.println("i");
        //...
        System.out.println("z");
		
	}
}


public class Main {
	public static void main(String[] args) {
		
		parents c1 = new child();
		c1.alphabet();
		
		System.out.println("---------------");
		
		child c2 = new child();
		c1.alphabet();
		
	}

}
