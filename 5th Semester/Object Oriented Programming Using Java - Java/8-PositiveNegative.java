package w1;
class Number1
{
	int x;
	int positiveNegative()
	{
		if ( x > 0 )
			return 1;
		else
			return 0;
	}
}
class PositiveNegative
{
	public static void main(String[] args)
	{
		Number1 f = new Number1();
		f.x = 6;
		int a = f.positiveNegative();
		System.out.println();
		if ( a == 1 )
			System.out.println(" The number " + f.x + " is positive.");
		else
			System.out.println(" The number " + f.x + " is negative.");
	}
}