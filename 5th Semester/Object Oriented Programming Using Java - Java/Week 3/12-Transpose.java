import java.util.*;
class Transpose
{
	public static void main(String[] args)
	{
		int a[][],b[][],m,n,i,j;
		System.out.print("\n Enter the number of rows in the array: ");
		Scanner x = new Scanner(System.in);
		m=x.nextInt();
		System.out.print("\n Enter the number of columns in the array: ");
		n=x.nextInt();
		a=new int[m][n];
		b=new int[n][m];
		for (i=0; i<m; i++)
			for (j=0; j<n; j++)
			{
				System.out.print("\n Enter element (" + (n*i+j+1) + "/" +(m*n)+"): ");
				a[i][j]=x.nextInt();
			}
		System.out.println("\n The transpose of the entered matrix is as follows :-\n");
		for (i=0; i<m; i++)
			for (j=0; j<n; j++)
				b[j][i]=a[i][j];
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
				System.out.print(" "+b[i][j]);
			System.out.println();
		}
	}
}
