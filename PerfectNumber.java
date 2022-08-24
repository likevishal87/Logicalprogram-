import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (isPerfect(num))
			System.out.println("true");

		else
			System.out.println("false");
	}

	static boolean isPerfect(int n) {

		int sum = 1;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i != n)
					sum = sum + i + n / i;
				else
					sum = sum + i;
			}
		}

		if (sum == n && n != 1)
			return true;

		return false;
	}

	{
		System.out.println("Below are all perfect" + "numbers till 10000");
		for (int n = 2; n < 10000; n++)
			if (isPerfect(n))
				System.out.println(n + " is a perfect number");

	}

}
