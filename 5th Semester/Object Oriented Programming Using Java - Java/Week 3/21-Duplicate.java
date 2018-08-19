import java.util.Scanner;
class Duplicate
{
	public static void main(String[] args)
	{
		int a[],b[],c=0,j,n,i,k=0,l,r;
		System.out.print("\n Enter the number of elements in the array: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		a= new int[n];
		b=new int[n];
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			a[i]=x.nextInt();
		}
		for (i=0; i<n-1; i++)
		{
			c=1;
			r=1;
			for (l=0; l<=k; l++)
				if (b[l]==a[i])
					r=0;
			if (r == 1)
			{
				for (j=i+1; j<n; j++)
					if (a[j]==a[i])
						c++;
				if (c>1)
				{
					b[k++]=a[i];
					System.out.println("\n The element " + a[i] + " occured " + c + " times.");
				}
			}
		}
	}
}						