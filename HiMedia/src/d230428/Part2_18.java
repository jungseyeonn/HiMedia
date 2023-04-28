package d230428;

public class Part2_18 {
	public static void main(String[] args) {
		int[] scores = {9,7,8,9,8};
		
		//처음부터 끝까지 더할 때
		int sum = 0;
		for(int s : scores) {
			sum += s;
		}
		
		System.out.println("sum : " + sum);
		
		//중간에 조건을 넣을 때 ex.짝수만
		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		System.out.println("sum2 : " + sum2);
	}
}
