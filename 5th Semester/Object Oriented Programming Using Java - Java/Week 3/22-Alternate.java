import java.util.Scanner;
class Alternate
{
	public static void main(String[] args)
	{
		int a[],c=0,n,i;
		System.out.print("\n Enter the number of elements in the array: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		a= new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			a[i]=x.nextInt();
		}
		System.out.print("\n The alternate elements in the array are: ");
		for (i = 0; i < n; i+=2)
			System.out.print(a[i] + ", ");
		System.out.println("\b\b.");
	}
}