package study;

abstract class Animal {
	abstract public void life();
	abstract public void ground();
}

class GroundAnimal extends Animal {
	int leg;

	@Override
	public void life() {
	}

	@Override
	public void ground() {
		System.out.println("hi");
	}
}

public class 추상클래스 {

	public static void main(String[] args) {
		Animal a = new GroundAnimal();
		a.life();
		// a.ground();
		if (a instanceof GroundAnimal) { //instanceof : a와 GroundAnimal를 비교해 같다면 true
			GroundAnimal ga = (GroundAnimal) a;
			ga.ground();
		}
	}
}
