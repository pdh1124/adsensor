package casting;

class Animal {
	public void life() {
		System.out.println("내가 조상의 삶.");
	}

	public void ghost() {
	}
}

class GroundAnimal extends Animal {
	int leg;

	public void ground() {
		System.out.println("땅땅땅");
	}

	@Override
	public void life() {
		// super.life();
		System.out.println("땅의 삶");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Animal a = new GroundAnimal();
		a.life();
		//a.ground();
		
		if (a instanceof GroundAnimal) { //instanceof 참조 자료형의 비교.
			GroundAnimal ga = (GroundAnimal) a;
			ga.ground();
		}
	}
}
