import java.util.*;
class SumOdd2D
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
				if (a[i][j]%2==1)
					s+=a[i][j];
		System.out.println("\n The sum of the odd elements in the array is: " +s+ ".");
	}
}