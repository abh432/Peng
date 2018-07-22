package w2;
import java.util.Scanner;
class Pattern2
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
			for (j = 1; j <= (2 * (n - i)); j++)
				System.out.print(" ");
			for (j = i; j >= 1; j--)
				System.out.print(" " + j);
			for (j = 2; j <= i; j++)
				System.out.print(" " + j);
			System.out.println();
		}
	}
}