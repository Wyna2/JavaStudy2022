package Day0921;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65;
		int code = (int)ch; // ch에 저장된 값을 int 타입으로 변환하여 저장
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		// 유니코드 65 = 16진수로 0x41
		
		char hch = '가'; // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
		
		hch = 0xAC00; // char hch = '가';
		System.out.printf("%c=%d%n", hch, (int)hch);
		
		hch = '\uAC00'; // char hch = '가';
		System.out.printf("%c=%d%n", hch, (int)hch);
	}

}
