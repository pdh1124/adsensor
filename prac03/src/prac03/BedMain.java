package prac03;

public class BedMain {

	public static void main(String[] args) {
		
		Bed myBedRoom = new Bed();
		
		myBedRoom.setPillow(2);
		System.out.println("���� ���� : " + myBedRoom.getPillow());
		
		myBedRoom.setElectricPad(true);
		System.out.println("���� ���� ���� : " + myBedRoom.getElectricPad());
		
		myBedRoom.setMattress("���ؽ�");
		System.out.println("��Ʈ���� ���� : " + myBedRoom.getMattress());
		
		myBedRoom.setTowel(false);
		System.out.println("���� ���� : " + myBedRoom.getTowel());
		
		myBedRoom.setBlanket("�ؼ���");
		System.out.println("�̺� ���� : " + myBedRoom.getBlanket());
		

	}

}
