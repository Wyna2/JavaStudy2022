package Day0919;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �Է�: ");
		String input = scanner.nextLine(); //�Է¹��� ���ڿ� input�� ����
		int num = Integer.parseInt(input); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³���: "+input);
		System.out.printf("num=%d%n", num);		
	}

}
