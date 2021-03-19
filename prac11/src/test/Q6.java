package test;

class Car {
	
	String w;
	String s;
	String h;
	
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	

}

public class Q6 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setH("handle");
		car.setW("wheel");
		car.setS("sheet");
		
		String a = car.getH() + car.getW() + car.getS();
		
		System.out.println(a.toString());
			
	}
	
}
