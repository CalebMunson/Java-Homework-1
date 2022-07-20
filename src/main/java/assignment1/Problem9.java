package assignment1;

public class Problem9 {
	public static void main(String[] args) {
		int primeNumber;
		int val = 1;
		int div;
		
		while (val <= 100) {
			div = 0;
			primeNumber = 2;
			while (primeNumber <= val / 2) {
				if (val % primeNumber == 0) {
					div++;
					break;
				}
				primeNumber++;
			}
			if (div == 0 && val != 1) {
				System.out.println(val);
			}
			val++;
		}
	}
}