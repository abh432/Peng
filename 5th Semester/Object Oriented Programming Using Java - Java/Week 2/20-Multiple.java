package w2;
import java.util.Scanner;
class Multiple
{
	public static void main(String[] args)
	{
		int m, n;
		System.out.print("\n Enter m: ");
		Scanner x = new Scanner(System.in);
		m = x.nextInt();
		System.out.print("\n Enter n: ");
		n = x.nextInt();
		if (m % n == 0)
			System.out.println("\n The number m (" + m + ") is a multiple of the number n (" + n + ").");
		else
			System.out.println("\n The number m (" + m + ") is not a multiple of the number n (" + n + ").");
	}
}