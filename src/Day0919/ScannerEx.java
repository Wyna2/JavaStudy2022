package Day0919;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 점수를 입력: ");
		String input = scanner.nextLine(); //입력받은 문자열 input에 저장
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용: "+input);
		System.out.printf("num=%d%n", num);		
	}

}
