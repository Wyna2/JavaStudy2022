package Day0917;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x: "+ x + " y: " + y);
		
		tmp = x; //변수 x에 저장된 값을 tmp에 저장
		x = y; //변수 y에 저장된 값을 x에 저장
		y = tmp; //변수 tmp에 저장된 값을 y에 저장
		
		System.out.println("x: "+ x + " y: "+ y);
		
	}

}
