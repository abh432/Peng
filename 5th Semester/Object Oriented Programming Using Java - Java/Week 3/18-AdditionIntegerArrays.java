import java.util.Scanner;
class Float
{
	public static void main(String[] args)
	{
		int n,i;
		int a[],a2[],a3[];
		System.out.print("\n Enter the number of elements in the 2 arrays: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		a= new int[n];
		a2= new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			a[i]=x.nextInt();
		}
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			a2[i]=x.nextInt();
		}
		a3=new int[n];
		for (i=0; i<n; i++)
			a3[i]=a[i]+a2[i];
		System.out.print("\n The resultant array after addition is: ");
		for (i=0; i<n; i++)
			System.out.print(a3[i]+", ");
		System.out.println("\b\b.");
	}
}