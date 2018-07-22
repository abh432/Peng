package w2;
import java.util.*;
class Armstrong
{
	int i, n, nd, d, a, o;
	void armstrong(int b)
	{
		n = b;
		while(b > 0)
		{
			b /= 10;
			nd++;
		}
		b = n;
		while(b > 0)
		{
			d = b % 10;
			o = d;
			b /= 10;
			for (i = 1; i < nd; i++)
				d = o * d;
			a += d;
		}
		if (n == a)
			System.out.println("\n Armstrong number.");
		else
			System.out.println("\n Not an Armstrong number.");
	}
}
class Check3
{
	public static void main(String[] args)
	{
		Armstrong x = new Armstrong();
		int asa;
		System.out.print("\n Enter a number: ");
		Scanner d = new Scanner(System.in);
		asa = d.nextInt();
		x.armstrong(asa);
	}
}