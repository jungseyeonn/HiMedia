package d230502;

public class P46 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87, 79, 56, 89};
		
		for (int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		System.out.println("scores[3] : " + scores[3]);
		
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("sum : " + sum);
		double avg = (double) sum / scores.length;
		System.out.printf("avg : %.1f",avg);
	}
}
