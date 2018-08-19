import java.util.Scanner;
class High2
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
			if (a[i]!=0)
				c++;
		}
		if (c==0)
			System.out.println("\n No non-zero elements in the array.");
		else
			System.out.println("\n Number of non-zero elements in the array: "+c+".");
	}
}