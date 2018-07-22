package w2;
import java.lang.Math;
import java.util.Scanner;
class ExponentialNumber
{
	public static void main(String[] args)
	{
		double x;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("\n Enter a number: ");
		x = sc.nextDouble();
		double g = Math.exp(x);
		System.out.println("\n Exponential of the number " + x + " is: " + g + ".");
	}
}