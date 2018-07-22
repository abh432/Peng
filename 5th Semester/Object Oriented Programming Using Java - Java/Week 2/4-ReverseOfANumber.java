package w2;
import java.util.Scanner;
class Number2
{
	void reverse(int c)
	{
		int r = 0, d, n;
		n = c;
		while(n > 0)
		{
			d = n % 10;
			n = n / 10;
			r = r * 10 + d;
		}
		System.out.println("\n The reverse of the number " + c + " is: " + r + ".");
	}
}
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter a number: ");
		int x = sc.nextInt();
		Number2 a = new Number2();
		a.reverse(x);
	}
}