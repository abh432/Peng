package w1;
class Number
{
	int x;
	int oddEven()
	{
		if ( x % 2 == 0 )
			return 1;
		else
			return 0;
	}
}
class OddEven
{
	public static void main(String[] args)
	{
		Number f = new Number();
		f.x = 6;
		int a = f.oddEven();
		System.out.println();
		if ( a == 1 )
			System.out.println(" The number " + f.x + " is even.");
		else
			System.out.println(" The number " + f.x + " is odd.");
	}
}