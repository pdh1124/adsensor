package prac03;

public class BedMain {

	public static void main(String[] args) {
		
		Bed myBedRoom = new Bed();
		
		myBedRoom.setPillow(2);
		System.out.println("베개 갯수 : " + myBedRoom.getPillow());
		
		myBedRoom.setElectricPad(true);
		System.out.println("전기 장판 유무 : " + myBedRoom.getElectricPad());
		
		myBedRoom.setMattress("라텍스");
		System.out.println("매트릭스 종류 : " + myBedRoom.getMattress());
		
		myBedRoom.setTowel(false);
		System.out.println("수건 유무 : " + myBedRoom.getTowel());
		
		myBedRoom.setBlanket("극세사");
		System.out.println("이불 종류 : " + myBedRoom.getBlanket());
		

	}

}
