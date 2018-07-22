package w2;
import java.util.*;
class Prime
{
	int f;
	void prime(int n)
	{
		int i;
		for (i = 1; i <= n; i++)
			if (n % i == 0)
				f++;
		if (f == 2)
			System.out.println("\n Prime.");
		else
			System.out.println("\n Not prime.");
	}
}
class Number144
{
	public static void main(String[] args)
	{
		System.out.print("\n Enter number: ");
		Scanner a = new Scanner(System.in);
		int r = a.nextInt();
		Prime d = new Prime();
		d.prime(r);
	}
}