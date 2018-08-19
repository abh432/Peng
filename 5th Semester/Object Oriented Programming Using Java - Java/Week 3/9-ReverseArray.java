import java.util.Scanner;
class Reverse
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
		for (i=0,j=n-1; i<n/2; i++,j--)
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		System.out.println("\n The reversed array is as follows :-\n");
		for (i=0; i<n; i++)
			System.out.print(" "+a[i]+",");
		System.out.println("\b.");
	}
}