package w2;
import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args)
	{
		int i, j, n;
		Scanner v = new Scanner(System.in);
		System.out.print("\n Enter number of rows: ");
		n = v.nextInt();
		System.out.println();
		for (i = 1; i <= n; i++)
		{	
			for (j = 2; j <= (2 * i); j++)
				System.out.print(" ");
			System.out.print(" " + i);
			for (j = (4 * (n - i)); j > 1; j--)
				System.out.print(" ");
			if (i != n)			
				System.out.println(i);
		}
	}
}