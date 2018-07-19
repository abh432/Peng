package w2;
import java.util.Scanner;
class Factorial
{
	int ab;
	int factorial(int x)
	{
		if (x == 1)
			return 1;
		else
		{
			ab = factorial(x-1);
			return ab * x;
		}
	}
}
class MainClass
{
	public static void main(String[] args)
	{
		Factorial h = new Factorial();
		int a = h.factorial(12);
		System.out.println("\n The factorial of the number 12 is: "+a+".");
	}
}