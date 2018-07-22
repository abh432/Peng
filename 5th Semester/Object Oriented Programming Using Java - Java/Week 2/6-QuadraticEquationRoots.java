package w2;
import java.lang.Math;
import java.util.Scanner;
class Equation
{
	double a, b, c;
}
class Roots
{
	public static void main(String[] args)
	{
		Equation x = new Equation();
		System.out.print("\n Enter the coefficients: ");
		Scanner e = new Scanner(System.in);
		x.a = e.nextDouble();
		x.b = e.nextDouble();
		x.c = e.nextDouble();
		double y = x.b * x.b - 4 * x.a * x.c;
		if (y > 0)
		{
			double o2 = (- x.b + Math.sqrt(y)) / (2 * x.a);
			double o1 = (- x.b - Math.sqrt(y)) / (2 * x.a);
			System.out.println("\n Roots: " + o1 + ", " + o2);
		}
		else
			System.out.println("\n No real roots.");
	}
}