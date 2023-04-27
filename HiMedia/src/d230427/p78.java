package d230427;

public class p78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		int totalPieces = apple * 10;
		
		double result = apple - number * pieceUnit;
		int temp = totalPieces - number;
		double result2 = temp / 10.0;
		
		System.out.println(result);
		System.out.println(result2);
	}
}
