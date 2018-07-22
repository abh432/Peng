package w2;
import java.util.*;
class Prime3
{
	int f;
	void prime(int a, int b)
	{
		int i, j;
		for (j = a; j <= b; j++)
		{
			f = 0;
			for (i = 1; i <= j; i++)
				if (j % i == 0)
					f++;
			if (f == 2)
				System.out.print(j + ", ");
		}
		System.out.println("\b\b.");
	}
}
class Number1444
{
	public static void main(String[] args)
	{
		System.out.print("\n Enter the lower bound of the interval: ");
		Scanner a = new Scanner(System.in);
		int r = a.nextInt();
		System.out.print("\n Enter the upper bound of the interval: ");
		int s = a.nextInt();
		Prime3 d = new Prime3();
		System.out.print("\n Prime numbers within the interval (" + r + "," + s + "): ");
		d.prime(r,s);
	}
}