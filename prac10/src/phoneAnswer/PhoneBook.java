package phoneAnswer;

import java.util.Scanner;

public class PhoneBook {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.creatManagerInst();
		manager.readFromFile();

		while (true) {
			Menu.showMenu();
			System.out.print("이름: ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				manager.readData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				manager.allList();
				break;
			case 5:
				scan.close();
				manager.storeToFile();
				System.exit(0);
			default:
				try {
					throw new MyExcep(choice);
				} catch (MyExcep e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
