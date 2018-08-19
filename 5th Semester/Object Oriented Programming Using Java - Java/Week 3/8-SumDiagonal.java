import java.util.*;
class SumArray2D
{
	public static void main(String[] args)
	{
		int a[][],m,i,j,s;
		System.out.print("\n Enter the number of rows and columns in the array: ");
		Scanner x = new Scanner(System.in);
		m=x.nextInt();
		a=new int[m][m];
		for (i=0; i<m; i++)
			for (j=0; j<m; j++)
			{
				System.out.print("\n Enter element (" + (m*i+j+1) + "/" +(m*m)+"): ");
				a[i][j]=x.nextInt();
			}
		s=0;
		for (i=0; i<m; i++)
			s+=a[i][i];
		System.out.println("\n The sum of the diagonal elements in the matrix is: "+s+".");
	}
}