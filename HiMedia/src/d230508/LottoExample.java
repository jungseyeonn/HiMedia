package d230508;

public class LottoExample {
	public static void main(String[] args) {
		boolean f = false;
		int[] num = new int[6];
		do {
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 45) + 1;
			}
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if (i != j && num[i] == num[j]) {
						f = true;
					}
				}
			}
		} while (f);
	}
}
