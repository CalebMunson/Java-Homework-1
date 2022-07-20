package assignment1;

public class Problem11 {

	public static void main(String[] args) {
		for(int i = 50; i <= 100; i++) {
			if (i % 2 == 0) System.out.println(i);
			else if (i == 75) break;
		}
	}

}
