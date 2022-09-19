package Day0917;

public class StringEx {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(7+" ");
		System.out.println(" "+7);
		System.out.println(7+"");
		System.out.println(""+7);
		System.out.println(""+"");
		
		//덧셈 연산자는 왼쪽에서 오른쪽으로 연산을 수행해 결과가 달라진다.
		System.out.println(7+7+"");
		System.out.println(""+7+7);
	}

}
