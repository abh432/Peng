import java.util.*;
class MultiplicationMatrix
{
	public static void main(String[] args)
	{
		int a[][], b[][], c[][], m, n, o, p, k, i, j;
		System.out.print("\n Enter the number of rows in the 1st array: ");
		Scanner x = new Scanner(System.in);
		m = x.nextInt();
		System.out.print("\n Enter the number of columns in the 1st array: ");
		n = x.nextInt();
		System.out.print("\n Enter the number of rows in the 2nd array: ");
		o = x.nextInt();
		System.out.print("\n Enter the number of columns in the 2nd array: ");
		p = x.nextInt();
		if (n != o)
		System.out.println("\n Matrix multiplication not possible.");
		else
		{
			a = new int[m][n];
			b = new int[o][p];
			c = new int[m][p];
			System.out.println("\n Matrix 1 :-\n");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
				{
					System.out.print("\n Enter element (" + (n * i + j + 1) + "/" +(m * n) + "): ");
					a[i][j] = x.nextInt();
				}
			System.out.println("\n Matrix 2 :-\n");
			for (i = 0; i < o; i++)
				for (j = 0; j < p; j++)
				{
					System.out.print("\n Enter element (" + (p * i + j + 1) + "/" + (o * p) + "): ");
					b[i][j] = x.nextInt();
				}
			for (i = 0; i < m; i++)
				for (j = 0; j < p; j++)
					c[i][j] = 0;
			for (i = 0; i < m; i++)
				for (j = 0; j < p; j++)
					for (k = 0; k < n; k++)
						c[i][j] += a[i][k] * b[k][j];
			System.out.println("\n The resultant of the multiplication of the 2 matrices is as follows :-\n");
			for (i = 0; i < m; i++)
			{
				System.out.println();
				for (j = 0; j < p; j++)
					System. out.print(" " + c[i][j]);
			}
			System.out.println();
		}
	}
}