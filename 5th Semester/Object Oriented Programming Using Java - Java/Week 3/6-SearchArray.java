import java.util.*;
class SearchArray
{
	public static void main(String[] args)
	{
		int a[],i,n,s,c=0;
		System.out.print("\n Enter the number of elements in the array: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		a=new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element (" + (i+1) + "/" + n+"): ");
			a[i]=x.nextInt();
		}
		System.out.print("\n Enter the number to be searched for: ");
		s = x.nextInt();
		for (i=0; i<n; i++)
		{
			if (a[i]==s)
			{
				System.out.println("\n Element " +s+ " found at position " +(i+1)+".");
				c++;
			}
		}
		if (c==0)
			System.out.println("\n Element " +s+ " not found in the entire array.");
	}
}