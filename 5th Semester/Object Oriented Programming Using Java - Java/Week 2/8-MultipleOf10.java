package w2;
import java.util.Scanner;
class Interval
{
	void multiple(int a, int b)
	{
		int i;
		System.out.print("\n The multiples of 10 in the given interval (" + a + "," + b + ") are: ");
		for (i = a; i <= b; i++)
			if (i % 10 == 0)
				System.out.print(i + ", ");
		System.out.print("\b\b.");
		System.out.println();
	}
}
class MultipleOf10
{
	public static void main(String[] args)
	{
		System.out.print("\n Enter the value of a for the interval (a,b): ");
		Scanner w;
		w = new Scanner(System.in);
		int a = w.nextInt();
		System.out.print("\n Enter the value of a for the interval (a,b): ");
		int b = w.nextInt();
		Interval x = new Interval();
		x.multiple(a,b);
	}
}