package w2;
import java.util.Scanner;
class Test
{
	int d;
	int digits(int y)
	{
		while(y > 0)
		{
			d++;
			y /= 10;
		}
		return d;
	}
}
class Number3
{
	public static void main(String[] args)
	{
		Scanner dsfag = new Scanner(System.in);
		System.out.print("\n Enter a number: ");
		int pw = dsfag.nextInt();
		Test a = new Test();
		int h = a.digits(pw);
		System.out.println("\n Number of digits in " + pw + ": " + h + ".");
	}
}