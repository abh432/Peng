package w2;
import java.util.Scanner;
class Euler
{
	void calculateEulersNumber()
	{
		int i, x, j;
		double e = 1,f;
		System.out.print("\n Enter the number of terms of the Euler series to be considered for approximation: ");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		for (i = 1; i <= x; i++)
		{
			f = 1;
			for (j = 1; j <= i; j++)
			f *= j;
			e += 1/f;
		}
		System.out.println("\n Euler's number (approximated by considering " + x + " terms) = " + e + ".");
	}
}
class EulerSeries
{
	public static void main(String[] args)
	{
		Euler w = new Euler();
		w.calculateEulersNumber();
	}
}
