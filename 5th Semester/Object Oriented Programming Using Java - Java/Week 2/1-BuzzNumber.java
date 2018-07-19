package w2;
import java.util.*;
class Number
{	
	int buzz(int y)
	{
		int u = y % 10;
		int h = y % 7;
		if (u == 7 || h == 0)
			return 1;
		else
			return 0;
	}
}
class Buzz
{
	public static void main(String[] args)
	{
		Number s = new Number();
		Scanner d = new Scanner(System.in);
		System.out.println();
		System.out.print(" Enter a number: ");
		int w = d.nextInt();
		int r = s.buzz(w);
		if (r == 1)
			System.out.println("\n The number " +w+ " is a buzz number.");
		else
			System.out.println("\n The number " +w+ " is not a buzz number.");
	}
}