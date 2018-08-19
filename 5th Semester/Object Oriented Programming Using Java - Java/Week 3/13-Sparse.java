import java.util.*;
class Sparse
{
	public static void main(String[] args)
	{
		int a[][],m,n,i,j,s;
		System.out.print("\n Enter the number of rows in the array: ");
		Scanner x = new Scanner(System.in);
		m=x.nextInt();
		System.out.print("\n Enter the number of columns in the array: ");
		n=x.nextInt();
		a=new int[m][n];
		for (i=0; i<m; i++)
			for (j=0; j<n; j++)
			{
				System.out.print("\n Enter element (" + (n*i+j+1) + "/" +(m*n)+"): ");
				a[i][j]=x.nextInt();
			}
		s=0;
		for (i=0; i<m; i++)
			for (j=0; j<n; j++)
				if (a[i][j]==0)
					s++;
		if (s>((m*n)/2))
			System.out.println("\n The entered matrix is a sparse matrix.");
		else
			System.out.println("\n The entered matrix is not a sparse matrix.");
	}
}