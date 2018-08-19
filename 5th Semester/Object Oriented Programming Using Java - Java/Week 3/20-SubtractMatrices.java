import java.util.*;
class SubtractionMatrix
{
	public static void main(String[] args)
	{
		int a[][], b[][], c[][], m, n, k, i, j;
		System.out.print("\n Enter the number of rows in the 2 matrices: ");
		Scanner x = new Scanner(System.in);
		m = x.nextInt();
		System.out.print("\n Enter the number of columns in the 2 matrices: ");
		n = x.nextInt();
		a = new int[m][n];
		b = new int[m][n];
		c = new int[m][n];
		System.out.println("\n Matrix 1 :-\n");
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
			{
				System.out.print("\n Enter element (" + (n * i + j + 1) + "/" +(m * n) + "): ");
				a[i][j] = x.nextInt();
			}
		System.out.println("\n Matrix 2 :-\n");
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				{
					System.out.print("\n Enter element (" + (n * i + j + 1) + "/" + (m * n) + "): ");
					b[i][j] = x.nextInt();
				}
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				c[i][j] = a[i][j] - b[i][j];
		System.out.println("\n The resultant of subtraction of the 2 matrices is as follows :-\n");
		for (i = 0; i < m; i++)
		{
			System.out.println();	
			for (j = 0; j < n; j++)
				System.out.print(" " + c[i][j]);
		}	
	}
}	