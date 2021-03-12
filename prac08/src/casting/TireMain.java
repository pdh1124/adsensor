package casting;

//타이어를 비유해서 상속을 받고 다형성을 이용하도록 클래스를 설계하세요.
//자식 클래스 : 4계절, 스포츠, 스노우, 오프로드,
//부모 변수에 담은후, 호출했을때, 각각의 특징을 표시하도록 구현하세요.

class Tire {
	public void Rolling() {
		System.out.println("굴러간다.");
	}

	public void Color() {
		System.out.println("회색");
	}

	public void Amount() {
		int a = 4;
		System.out.println("갯수는 " + a);
	}

	public void Speed() {
		int speed = 100;
		System.out.println("속도 : " + speed);
	}
}

class FourSeason extends Tire {
	public void Point() {
		System.out.println("4계절 사용 가능");
	}

	@Override
	public void Speed() {
		int speed = 90;
		//System.out.println("속도 : " + speed);
	}
}

class Sport extends Tire {
	public void Point() {
		System.out.println("속도가 빠르다.");
	}

	public void Money() {
		System.out.println("비싸다.");
	}

	@Override
	public void Speed() {
		int speed = 150;
		//System.out.println("속도 : " + speed);
	}

	@Override
	public void Color() {
		System.out.println("빨간색");
	}
}

class Snow extends Tire {
	public void Point() {
		System.out.println("눈이 올때 사용한다.");
	}
	
	public void Thickness() {
		System.out.println("두껍다.");
	}
	
	@Override
	public void Speed() {
		int speed = 70;
		//System.out.println("속도 : " + speed);
	}

	@Override
	public void Color() {
		System.out.println("파란색");
	}
}

class OffRoad extends Tire {
	public void Point() {
		System.out.println("산에 오를때 사용한다.");
	}
	
	public void Thickness() {
		System.out.println("완전 두껍다.");
	}
	
	@Override
	public void Speed() {
		int speed = 40;
		//System.out.println("속도 : " + speed);
	}

	@Override
	public void Color() {
		System.out.println("검은색");
	}
}

public class TireMain {
	public static void main(String[] args) {
		Tire CarOne = new Tire();
		CarOne.Rolling();
		CarOne.Color();
		CarOne.Amount();
		CarOne.Speed();
		
		System.out.println("-----------------");
				
		Tire CarTwo = new FourSeason();
		//CarTwo.Point();
		//CarTwo.money();
		CarTwo.Speed();
		CarTwo.Amount();
		CarTwo.Color();
		
		if (CarTwo instanceof FourSeason) {
			FourSeason CarTwoSeason = (FourSeason) CarTwo;
			CarTwoSeason.Point();
		}
		
		System.out.println("-----------------");
		
		FourSeason CarThree = new FourSeason();
		CarThree.Point();
		CarThree.Speed();
		
		System.out.println("-----------------");
		
		Sport CarFour = new Sport();
		CarFour.Point();
		CarFour.Money();
		CarFour.Amount();
		CarFour.Color();
		
		System.out.println("-----------------");
		
		Tire CarFive = new OffRoad();
		CarFive.Rolling();
		CarFive.Color();
		CarFive.Amount();
		CarFive.Speed();
		
		
	}

}
