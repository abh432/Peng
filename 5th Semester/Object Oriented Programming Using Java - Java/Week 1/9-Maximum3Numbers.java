package w1;
class Set
{
	int a,b,c;
	int maximum()
	{
		if ( a > b || a == b)
			if ( a > c || a == c)
				return a;
			else
				return c;
		else
			if ( b > c || b == c)
				return b;
			else
				return c;
	}
}
class Compare
{
	public static void main(String[] args)
	{
		Set x = new Set();
		x.a = 95;
		x.b = 62;
		x.c = 60;
		int max = x.maximum();
		System.out.println();
		System.out.println(" The maximum of the 3 numbers " + x.a + ", " + x.b + " and " + x.c + " is: " + max + ".");
	}
}