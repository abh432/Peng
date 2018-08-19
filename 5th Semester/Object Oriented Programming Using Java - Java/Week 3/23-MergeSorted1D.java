import java.util.Scanner;
class Merge
{
	public static void main(String[] args)
	{
		int A[],B[],C[],n,n2,i,j,k,l;
		System.out.print("\n Enter the number of elements in 1st array: ");
		Scanner x = new Scanner(System.in);
		n=x.nextInt();
		A= new int[n];
		System.out.print("\n Enter the number of elements in 2nd array: ");
		n2=x.nextInt();
		System.out.println("\n Enter the elements of the 1st sorted array :-");
		for (i=0; i<n; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n+"): ");
			A[i]=x.nextInt();
		}
		B= new int[n2];
		System.out.println("\n Enter the elements of the 2nd sorted array :-");
		for (i=0; i<n2; i++)
		{
			System.out.print("\n Enter element ("+(i+1)+"/"+n2+"): ");
			B[i]=x.nextInt();
		}
		C=new int[(n+n2)];
		for (i=0,j=0,k=0; i<n || j<n2;)
		{
			if (i==n)
				for (; j<n2; j++)
					C[k++]=B[j];
			else if (j==n2)
				for (; i<n; i++)
					C[k++]=A[i];
			else if (A[i]<B[j])
				C[k++]=A[i++];
			else
				C[k++]=B[j++];
		}
		System.out.print("\n The merged (sorted) array is: ");
		for (i=0; i<n+n2; i++)
			System.out.print(C[i]+", ");
		System.out.println("\b\b.");
	}
}