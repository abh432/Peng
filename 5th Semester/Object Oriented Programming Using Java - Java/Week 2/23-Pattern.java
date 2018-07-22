package w2;
import java.util.Scanner;
class Pattern
{
	public static void main(String[] args)
	{
		int i, j, k = 1, n;
		Scanner v = new Scanner(System.in);
		System.out.print("\n Enter number of rows: ");
		n = v.nextInt();
		System.out.println();
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++)
			System.out.print(" " + k++ + " ");
			System.out.println();
		}
	}
}