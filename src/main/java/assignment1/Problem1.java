package assignment1;

public class Problem1 {

	public static void main(String[] args) {
		operations(5, 6);
		unary(5, 6);
		relationAndLogic(5, 6);
		
	}
	
	private static void operations(int i, int j) {
		System.out.print("Addition: ");
		System.out.println(i + j);
		System.out.print("Subtraction: ");
		System.out.println(i - j);
		System.out.print("Multiplication: ");
		System.out.println(i * j);
		System.out.print("Division: ");
		System.out.println(i / j);
		System.out.print("Modulus: ");
		System.out.println(i % j);
	}
	
	private static void unary(int i, int j) {
		System.out.println("Increment");
		System.out.println(i++);
		System.out.println(++i);
		System.out.println("Decrement");
		System.out.println(j--);
		System.out.println(--j);
	}
	
	private static void relationAndLogic(int i, int j) {
		if (i > j) System.out.println("i is greater than j");
		else if (i < j) System.out.println("i is lesser than j");
		else if (i == j) System.out.println("i is equal to j");
		
		if (i == 2 || j == 2) System.out.println("One of the variables is equal to \"2\"");
		if (i != 2 && j != 2) System.out.println("Neither of the variables is equal to \"2\"");
	}

}
