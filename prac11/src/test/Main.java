package test;

import java.util.Scanner;

class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String address;
	private String memo;

	public PhoneInfo() {

	}

	public PhoneInfo(String name, String phoneNumber, String address, String memo) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.memo = memo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		System.out.println("address: " + address);
		System.out.println("memo: " + memo);
		System.out.println();
	}

}

class PhoneManager {

	PhoneInfo[] phoneList = new PhoneInfo[3];

	int arr = 0;

	void save() {

		System.out.print("이름 :");
		String name = Main.scan.nextLine();
		System.out.print("연락처 :");
		String PhoneNumber = Main.scan.nextLine();
		System.out.print("주소 :");
		String address = Main.scan.nextLine();
		System.out.print("memo :");
		String memo = Main.scan.nextLine();

		PhoneInfo people = new PhoneInfo(name, PhoneNumber, address, memo);
		phoneList[arr] = people;
		arr++;
	}

}

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		PhoneManager manager = new PhoneManager();

		for (int i = 0; i < 3; i++) {
			manager.save();

		}
		for (int j = 0; j < 3; j++) {
			manager.phoneList[j].showInfo();

		}

	}

}
