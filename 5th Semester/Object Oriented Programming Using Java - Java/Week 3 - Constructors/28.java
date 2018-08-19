import java.util.Scanner;
class Commission
{
	double sales;
	Commission(double y)
	{
		sales = y;
	}
	double commission()
	{
		return sales / 2.0;
	}
}
class Demo3
{
	public static void main(String[] args)
	{
		double F;
		System.out.print("\n Enter the sales: ");
		Scanner d = new Scanner(System.in);
		F = d.nextDouble();
		if  (F > 0)
		{
			Commission v = new Commission(F);
			System.out.println("\n The commission for the sales " + F + " is: " + v.commission() + ".");
		}
		else
			System.out.println("\n Invalid input.");
	}
}