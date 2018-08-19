class Fraction
{
	int num, den;
	double fr;
	Fraction()
	{
		num = 1;
		den = 1;
	}
	Fraction(int y)
	{
		num = y;
		den = 1;
	}
	Fraction(int c, int x)
	{
		num = c;
		den = x;
	}
	void display()
	{
		fr = (double)num / den;
		System.out.println("\n Fraction value: " + fr + ".");
	}
}
class Wall
{
	public static void main(String[] args)
	{
		Fraction g = new Fraction();
		Fraction h = new Fraction(8);
		Fraction j = new Fraction(8,3);
		g.display();
		h.display();
		j.display();
	}
}
