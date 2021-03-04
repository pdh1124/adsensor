package prac03;

public class Car {
	//클래스의 멤버 필드.(클래스에서 값을 저장하고 있는 변수)
	int speed;
	int distance;
	String color;
	String name;
	int energy;
	
	
	//속도 설정(set) 메소드
	public void setSpeed(int speed2) {
		this.speed = speed2;
		// 매개변수로 전달받은 speed2를 car 객체의 speed 정보에 등록.
		// void : 리턴 값이 없음.
		// this : 객체 자신을 가르킴
	}
	
	//속도값 읽어오기(get)
	public int getSpeed() {
		return speed;
		//객체의 저장된 speed를 읽어와서 호출한 곳에 int 값 표시.
	}
	
	//카멜(낙타 혹) 표기법. 문장과 문장이 연결될때 첫글자를 대문자로 쓴다. (getSpeedIsNow)
	
	
	// 코드의 빈 공간에서 마우스 우클릭 하고, source >> generate getter and setter
	public void setColor(String color2) {
		this.color = color2;
	}
	public String getColor() {
		return color;
	} 
	
	
	
}
