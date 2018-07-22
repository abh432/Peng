package w2;
import java.util.Scanner;
class Median
{
	double median;
	void calculateMedian()
	{
		int i, j, n, t;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the number of values in the set: ");
		n=sc.nextInt();
		int[] p = new int[n];
		System.out.println("\n Enter " + n + " values :-\n");
		for (i = 0; i < n; i++)
		{
			System.out.print(" Value " + (i + 1) + ": ");
			p[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++)
			for (j = 0; j < (n-1); j++)
				if (p[j] > p[j+1])
				{
					t = p[j];
					p[j] = p[j+1];
					p[j+1] = t;
				}
		System.out.print("\n The sorted value set (in ascending order) is: ");
		for (i = 0; i < n; i++)
			System.out.print(p[i] + ", ");
		System.out.println("\b\b.");
		if (n % 2 == 1)
			median = p[n/2];
		else
			median = (p[(n/2) - 1] + p[n/2])/2.0;
		System.out.println("\n The median of the data set is: " + median + ".");
	}
}
class Data
{
	public static void main(String[] args)
	{
		Median h = new Median();
		h.calculateMedian();
	}
}