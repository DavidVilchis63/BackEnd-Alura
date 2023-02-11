
public class Factorial {

	public static void main(String[] args) {

		int n = 10;
		if (n == 0) {
			System.out.println(1);
		}

		int factorial = n;
		for (int i = n - 1; i > 1; i--) {

			factorial = factorial * i;

		}
		System.out.println(factorial);
	}
}
