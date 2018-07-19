package w1;
class Year
{
	int y;
	int leapYear()
	{
		if ( y % 4 == 0 )
			if ( y % 100 == 0 )
				if ( y % 400 == 0 )
					return 1;
				else
					return 0;
			else
				return 1;
		else
			return 0;
	}
}
class CheckYear
{
	public static void main(String[] args)
	{
		Year A = new Year();
		A.y = 1998;
		int r = A.leapYear();
		System.out.println();
		if ( r == 1 )
			System.out.println(" The year " + A.y + " is a leap year.");
		else
			System.out.println(" The year " + A.y + " is not a leap year.");
	}
}