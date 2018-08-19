import java.util.Scanner;
class High2
{
	public static void main(String[] args)
	{
		int a[],t,t2,n,i,j;
		System.out.print("\n Enter the number of elements in the array: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		a= new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			a[i]=x.nextInt();
		}
		t=a[0];
		for (i=0; i<n; i++)
		{
			if (a[i]>t)
			t=a[i];
		}
		t2=t;
		for (i=0; i<n; i++)
		{
			if (t2==t)
				t2=a[i];
			else
				if (a[i]>t2 && a[i]!=t)
					t2=a[i];
		}
		System.out.println("\n The second-highest element in the array is: "+t2+".");
	}
}