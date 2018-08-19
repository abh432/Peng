import java.util.Scanner;
class Prime1D
{
	public static void main(String[] args)
	{
		int a[],t,n,i,j;
		System.out.print("\n Enter the number of elements in the array: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		a= new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			a[i]=x.nextInt();
		}
		System.out.print("\n The prime numbers in the array are: ");
		int f;
		for (i = 0; i < n; i++)
		{
			f=0;
			for (j=1; j<=a[i]; j++)
			if (a[i] % j == 0)
				f++;
			if (f == 2)
				System.out.print(a[i]+", ");
		}
		System.out.println("\b\b.");
	}
}