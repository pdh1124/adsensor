package phoneAnswer;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	HashSet<PhoneInfo> phoneList = new HashSet<>();
	String path = "c:/temp/PhoneBook.dat";

	void storeToFile() {
		if (phoneList != null) {// 널이 아니라면,
			Iterator<PhoneInfo> itr = phoneList.iterator();
			// hashSet 객체에서 요소에 접근하기 위한 iterator(반복자) 변수를 초기화.
			ObjectOutputStream objOut = null;// 출력 처리를 위한 변수지정.
			FileOutputStream fileOut = null;// 출력 처리를 위한 변수지정.

			try {
				fileOut = new FileOutputStream(path);
				objOut = new ObjectOutputStream(fileOut);

				while (itr.hasNext()) {
					PhoneInfo p = itr.next();
					objOut.writeObject(p);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					objOut.close();
					fileOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	void readFromFile() {
		ObjectInputStream objInputStream = null;
		FileInputStream inputStream = null;

		File dir = new File("c:/temp/");
		if (!dir.isDirectory()) {
			dir.mkdir();
		}

		File file1 = new File(path);
		if (!file1.isFile()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			inputStream = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			if (inputStream.available() != -1) {
				// inputStream.available() : inputStream 에서 읽어올 내용이 있는가?
				// 없다면 -1 리턴.
				objInputStream = new ObjectInputStream(inputStream);
				// 역직렬화 준비.
				// 바이너리 코드를 자바 객체로 전환.

				while (inputStream.available() > 0) {
					// eof : end of file
					try {
						phoneList.add((PhoneInfo) objInputStream.readObject());
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
				objInputStream.close();

			} else {
				System.out.println("�� ���Ϸ� ���� ������ �����ϴ�.");
			}
		} catch (EOFException e) {
			System.out.println("�� ���Ϸ� ���� ������ �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private PhoneBookManager() {

	}

	static PhoneBookManager inst = null;

	public static PhoneBookManager creatManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();
		return inst;
	}

	void readData() {
		String sName, sPhoneNum;
		System.out.print("������ �Է��� �����մϴ�.");
		System.out.println("1.�Ϲ�, 2.����, 3.ȸ��");
		System.out.print("���� : ");
		int choice = PhoneBook.scan.nextInt();

		System.out.print("�̸� : ");
		sName = PhoneBook.scan.next();
		System.out.print("��ȭ��ȣ : ");
		sPhoneNum = PhoneBook.scan.next();

		switch (choice) {
		case 1:
			PhoneInfo pi = new PhoneInfo(sName, sPhoneNum);
			phoneList.add(pi);
			System.out.print("������ �Է��� �Ϸ�Ǿ����ϴ�.");
			break;
		case 2:
			System.out.print("���� : ");
			String major = PhoneBook.scan.next();
			System.out.print("�г� : ");
			int year = PhoneBook.scan.nextInt();
			PhoneInfo pui = new PhoneUnivInfo(sName, sPhoneNum, major, year);

			phoneList.add(pui);
			System.out.print("������ �Է��� �Ϸ�Ǿ����ϴ�.");
			break;
		case 3:

			System.out.print("ȸ�� : ");
			String company = PhoneBook.scan.next();
			PhoneInfo pci = new PhoneCompanyInfo(sName, sPhoneNum, company);

			phoneList.add(pci);
			System.out.print("������ �Է��� �Ϸ�Ǿ����ϴ�.");
			break;
		default:
			try {
				throw new MyExcep(choice);
			} catch (MyExcep e) {
				System.out.println(e.getMessage());
				// e.printStackTrace();
			}

		}

		System.out.println();

	}

	boolean searchIndex(String name, String state) {
		Iterator<PhoneInfo> itr = phoneList.iterator();
		boolean has = false;

		while (itr.hasNext()) {
			PhoneInfo p = itr.next();

			if (name.equals(p.getName())) {
				if (state.equals("search")) {
					p.showPhoneInfo();
					has = true;
				} else if (state.equals("del")) {
					itr.remove();
					has = true;
				}
				break;
			}
		}

		return has;

	}

	void searchData() {
		System.out.println("������ �˻��� �����մϴ�.");
		System.out.print("�̸� : ");
		String sName = PhoneBook.scan.next();
		boolean has = searchIndex(sName, "search");
		if (!has) {
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		}

	}

	void deleteData() {
		System.out.println("������ ������ �����մϴ�..");
		System.out.print("�̸� : ");
		String sName = PhoneBook.scan.next();
		boolean has = searchIndex(sName, "del");

		if (!has) {
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		}

		System.out.println("���� ��ϵ� ����ó : " + phoneList.size() + "\n");

	}

	void allList() {

		Iterator<PhoneInfo> itr = phoneList.iterator();

		while (itr.hasNext()) {
			PhoneInfo p = itr.next();
			p.showPhoneInfo();
		}
	}
}
