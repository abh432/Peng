import java.util.*;
class Minimum
{
	public static void main(String[] args)
	{
		int a[],n,i,m;
		Scanner x = new Scanner(System.in);
		System.out.print("\n Enter the number of elements in the array: ");
		n=x.nextInt();
		a=new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element (" + (i+1) + "/" + n+"): ");
			a[i]=x.nextInt();
		}
		m=a[0];
		for (i=0; i<n; i++)
		{
			if (m>a[i])
			m=a[i];
		}
		System.out.println("\n The mimimum element in the array is: " +m+ ".");
	}
}