import java.util.Scanner;
class Float
{
	public static void main(String[] args)
	{
		int m,n,i;
		float a[],a2[],a3[];
		System.out.print("\n Enter the number of elements in the 1st array: ");
		Scanner x = new Scanner(System.in);
		m=x.nextInt();
		a= new float[m];
		System.out.print("\n Enter the number of elements in the 2nd array: ");
		n=x.nextInt();
		a2= new float[n];
		for (i=0; i<m; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+m+"): ");
			a[i]=x.nextFloat();
		}
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			a2[i]=x.nextFloat();
		}
		a3=new float[m+n];
		for (i=0; i<(m+n); i++)
		{
			if (i<m)
				a3[i]=a[i];
			else
				a3[i]=a2[i-m];
		}
		System.out.println("\n The merged array is as follows :-\n");
		for (i=0; i<(m+n); i++)
			System.out.print(a3[i]+", ");
		System.out.println("\b\b.");
	}
}