package assignment1;

public class Problem2 {

	public static void main(String[] args) {
		isEvenOrOdd(Integer.parseInt(args[0]));
	}
	
	private static void isEvenOrOdd(int i) {
		if (i % 2 == 1) System.out.println("i is odd");
		else System.out.println("i is even");
	}
}
