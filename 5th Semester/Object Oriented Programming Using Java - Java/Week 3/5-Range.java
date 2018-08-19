import java.util.*;
class RangeArray
{
	public static void main(String[] args)
	{
		int a[],n,i,m,mm,r;
		Scanner x = new Scanner(System.in);
		System.out.print("\n Enter the number of elements in the array: ");
		n=x.nextInt();
		a=new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element (" + (i+1) + "/" + n+"): ");
			a[i]=x.nextInt();
		}
		m=mm=a[0];
		for (i=0; i<n; i++)
		{
			if (m>a[i])
				m=a[i];
			if (mm<a[i])
				mm=a[i];
		}
		r=mm-m;
		System.out.println("\n The range of the elements in the array is: " +r+ ".");
	}
}