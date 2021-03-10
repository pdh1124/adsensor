package casting;

class Tire {

	public void Speed() {
		int speed = 100;
		System.out.println("속도 : " + speed); //이것을 이미 부모에 입력을 해줬는데 
		System.out.print("바뀌지");
		System.out.print("않을");
		System.out.print("코드들");
	}
}

class FourSeason extends Tire {

	@Override
	public void Speed() {
		int speed = 90;
		System.out.println("속도 : " + speed); //이거를 굳이 다시 넣어주어야 하나요?
	}
}


public class TireMain {
	public static void main(String[] args) {
		
		Tire c1 = new FourSeason();
		c1.Speed();
		
		FourSeason c2 = new FourSeason();
		c1.Speed();
		
	}

}
