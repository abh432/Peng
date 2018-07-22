package w2;
import java.util.Scanner;
class Hcf
{
	public static void main(String[] args)
	{
		int u, m, i;
		System.out.print("\n Enter 1st number: ");
		Scanner d = new Scanner(System.in);
		int d1 = d.nextInt();
		System.out.print("\n Enter 2nd number: ");
		int d2 = d.nextInt();
		u = 1;
		if (d1<d2)
			m = d1;
		else
			m = d2;
		for (i = 1; i <= m; i++)
			if (d1 % i == 0 && d2 % i == 0)
				if (i > u)
					u = i;
		System.out.println("\n The HCF of the numbers " + d1 + " and " + d2 + " is: " + u + ".");
	}
}