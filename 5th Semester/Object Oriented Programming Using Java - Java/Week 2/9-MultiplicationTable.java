package w2;
import java.util.Scanner;
class Table
{
	void table(int x)
	{
		System.out.println("\n The multiplication table for the number " + x + " is as follows :-\n");
		int i;
		for (i = 1; i <= 10; i++)
			System.out.println(x + " * " + i + " = " + x * i + ".");
	}
}
class Multiply
{
	public static void main(String[] args)
	{
		System.out.print("\n Enter a number: ");
		Scanner a = new Scanner(System.in);
		int y = a.nextInt();
		Table r = new Table();
		r.table(y);
	}
}