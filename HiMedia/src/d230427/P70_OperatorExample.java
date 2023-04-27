package d230427;

public class P70_OperatorExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		b = ~a;
		
		System.out.println(a);
		System.out.println(b);
		
		b = ~b;
		
		System.out.println(b);

		//10 = 000~1010 (양수)
		//~10 = 111~0101 (음수) -> 32비트의 int 숫자를 알기위해
		//2의보수 구해야함. 구하면 -11
	}
}
