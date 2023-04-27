package d230427;

public class P73_OperatorExample {

	public static void main(String[] args) {
		byte a = 10;
		int b = 5;
		int c = 7;
		double d = 4.8;
		
		int result1 = a + b;
		//byte result3 = a + b; int와 byte 중 int값이 크기 때문에
		//int로 변경되어 오류가 발생함
		double result2 = c + d;
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
