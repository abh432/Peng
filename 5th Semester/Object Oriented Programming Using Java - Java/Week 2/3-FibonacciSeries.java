package w2;
import java.util.*;
class Series
{
	int r,s;
	void fibonacci(int g)
	{
		int i,j;
		r = s = 1;
		System.out.print("1, ");
		for (i=1; i<g; i++)
		{
			System.out.print(s+", ");
			j = s;
			s += r;
			r = j;
		}
		System.out.print("\b\b.");
	}
}
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.print("\n Enter number of terms: ");
		int mm = a.nextInt();
		Series ob = new Series();
		System.out.print("\n Fibonacci series of " +mm+ " terms: ");
		ob.fibonacci(mm);
		System.out.println();
	}
}