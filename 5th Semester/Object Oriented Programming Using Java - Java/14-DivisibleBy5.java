package w1;
class Divisibility
{
	int c;
	int divisibleBy5()
	{
		if ( c % 5 == 0 )
			return 1;
		else
			return 0;
	}
}
class DivisibleBy5
{
	public static void main(String[] args)
	{
		Divisibility u = new Divisibility();
		u.c = 35;
		int y = u.divisibleBy5();
		System.out.println();
		if ( y == 1 )
			System.out.println(" The number " + u.c + " is divisible by 5.");
		else
			System.out.println(" The number " + u.c + " is not divisible by 5.");
	}
}