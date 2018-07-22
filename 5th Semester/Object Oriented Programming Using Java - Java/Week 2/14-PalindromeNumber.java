package w2;
import java.util.Scanner;
class Palindrome
{
	int s, r;
	void palindrome(int p)
	{
		int d;
		s = p;
		while(p > 0)
		{
			d = p % 10;
			p /= 10;
			r = r * 10 + d;
		}
		if (r == s)
			System.out.println("\n Palindrome.");
		else
			System.out.println("\n Not a palindrome.");
	}
}
class Number4
{
	public static void main(String[] args)
	{
		int x;
		System.out.print("\n Enter a number: ");
		Scanner a = new Scanner(System.in);
		x = a.nextInt();
		Palindrome z = new Palindrome();
		z.palindrome(x);
	}
}