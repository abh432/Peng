package d1;
class Temperature
{
	double c,f;
	void cToF()
	{
		f = 9.0 / 5.0 * c + 32.0;
	}
	void fToC()
	{
		c = 5.0 / 9.0 * (f - 32.0);
	}
}
class Convert
{
	public static void main(String[] args)
	{
		Temperature x = new Temperature();
		x.c = 100;
		x.cToF();
		System.out.println("");
		System.out.println(" " + x.c + " *C in Fahrenheit: " + x.f + " *F.");
		x.fToC();
		x.cToF();
		System.out.println("");
		System.out.println(" " + x.f + " *F in Celsius: " + x.c + " *C.");
		System.out.println("");
	}
}