package prac02;

import java.util.Scanner;

public class NextInt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//ȭ�鿡�� ���� �Է� �ްڴ�.
				
		int a = sc.nextInt(); //1��° �Է°��� int �� ����.
		int b = sc.nextInt(); //2��° �Է°��� int �� ����.
		System.out.println(a + b);
		
		sc.close(); //�ü������ �Է¿� ���� �ڿ��� �� ������ �ݳ�.
		
	}
}
