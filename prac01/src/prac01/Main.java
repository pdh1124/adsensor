package prac01;

public class Main {

	// class : �ؾ Ʋ
	// public : ���� ������.(����)
	// private : ���� ������. (�����)

	// �޼ҵ�� �޼ҵ�� () ��ȣ ���� �ݰ�,
	public static void main(String[] args) {
		// static ���� �޸� ������ �����϶�.
		// void : �ݳ��ϴ� ���� ����.
		// String[] : ���ڿ� �迭�� �޾Ƽ� ó�� ����.
		// args : �޾ƿ��� ���ڿ� �迭�� ������ args�� ����.

		// main �̶�� Ư���� �޼ҵ� ����. main �� ctrl + spacebar
		// �޼ҵ�� ���α׷��� ����� ����ϴ� �κ�.
		System.out.println("hello world"); // syso �� ctrl + spacebar
		System.out.println("555555");
		// System : �ý��۰� ���õ� ������� ������ �ִ� Ŭ����.
		// out : ���� ����.
		// println : ����� �����ִ� �޼ҵ�.
		// hello world : ����ϰ��� �ϴ� ���ڿ�.

		// �ؼ� : �ý����� ��°� �����ؼ� println(�ٹٲ����) �޼ҵ� ���.

		
		
		// ���� ���
		int a = 7;
		// int : �⺻ �ڷ������� �������� ����.(4byte)
		// ������ �ڷ��� a�� 1�� �����϶�.
		// �ڷ��� : ����(1byte, 2byte, 4byte, 8byte), �Ǽ�, ����, ���ڿ�, ������  
		int b = 5;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		// ctrl + shift + f : �ڵ� �ٸ���.
		// ctrl + shift + o : �ڵ� import
		// ctrl + shift + s : �ڵ� ����
	}

}