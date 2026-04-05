package InterviewProg;

public class PrimeNumbersFrom1To100 {

	public static void main(String[] args) {

		for (int ma = 1; ma <= 1000000; ma++) {
			int count = 1;
			if (ma > 1) {
				for (int i = 1; i < ma; i++) {
					if (ma % i == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println("It is a prime:" + ma);
				} else {
					System.out.println("It is not a prime:" + ma);
				}
			}
		}

	}

}
