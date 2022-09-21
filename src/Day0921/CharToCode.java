package Day0921;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65;
		int code = (int)ch; // ch�� ����� ���� int Ÿ������ ��ȯ�Ͽ� ����
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		// �����ڵ� 65 = 16������ 0x41
		
		char hch = '��'; // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
		
		hch = 0xAC00; // char hch = '��';
		System.out.printf("%c=%d%n", hch, (int)hch);
		
		hch = '\uAC00'; // char hch = '��';
		System.out.printf("%c=%d%n", hch, (int)hch);
	}

}
