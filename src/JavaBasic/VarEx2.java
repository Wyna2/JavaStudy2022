package JavaBasic;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x: "+ x + " y: " + y);
		
		tmp = x; //���� x�� ����� ���� tmp�� ����
		x = y; //���� y�� ����� ���� x�� ����
		y = tmp; //���� tmp�� ����� ���� y�� ����
		
		System.out.println("x: "+ x + " y: "+ y);
		
	}

}