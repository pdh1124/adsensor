package prac03;

public class Car {
	//Ŭ������ ��� �ʵ�.(Ŭ�������� ���� �����ϰ� �ִ� ����)
	int speed;
	int distance;
	String color;
	String name;
	int energy;
	
	
	//�ӵ� ����(set) �޼ҵ�
	public void setSpeed(int speed2) {
		this.speed = speed2;
		// �Ű������� ���޹��� speed2�� car ��ü�� speed ������ ���.
		// void : ���� ���� ����.
		// this : ��ü �ڽ��� ����Ŵ
	}
	
	//�ӵ��� �о����(get)
	public int getSpeed() {
		return speed;
		//��ü�� ����� speed�� �о�ͼ� ȣ���� ���� int �� ǥ��.
	}
	
	//ī��(��Ÿ Ȥ) ǥ���. ����� ������ ����ɶ� ù���ڸ� �빮�ڷ� ����. (getSpeedIsNow)
	
	
	// �ڵ��� �� �������� ���콺 ��Ŭ�� �ϰ�, source >> generate getter and setter
	public void setColor(String color2) {
		this.color = color2;
	}
	public String getColor() {
		return color;
	} 
	
	
	
}
