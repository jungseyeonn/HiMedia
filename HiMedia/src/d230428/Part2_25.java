package d230428;

public class Part2_25 {

	public static void main(String[] args) {
		int i = 1;
		
		while (true) { //무한loop : 모든 값이 true
			System.out.println(i);
			
			if (i==6) // 중괄호{}가 없을 땐 뒤에 있는 한 문장이 실행됨.
				break;
			
			i = i + 1;
		}
	}
}
