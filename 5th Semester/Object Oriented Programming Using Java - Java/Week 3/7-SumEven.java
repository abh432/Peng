import java.util.*;
class Array2
{
	public static void main(String[] args)
	{
		int a[],i,n,s;
		double av;
		System.out.print("\n Enter the number of elements in the array: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		a=new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element (" + (i+1) + "/" + n+"): ");
			a[i]=x.nextInt();
		}
		s = 0;
		for (i=0; i<n; i++)
		{
			if (a[i]%2==0)
				s+=a[i];
		}
		System.out.println("\n The sum of the even elements in the array is: " +s+ ".");
	}
}