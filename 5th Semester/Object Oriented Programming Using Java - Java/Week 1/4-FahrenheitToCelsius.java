package w1;
class Temperature1
{
	double c,f;
	void fToC()
	{
		c = 5.0 / 9.0 * (f - 32.0);
	}
}
class Convert1
{
	public static void main(String[] args)
	{
		Temperature1 x = new Temperature1();
		System.out.println("");
		x.f = 100;
		x.fToC();
		System.out.println("");
		System.out.println(" " + x.f + " *F in Celsius: " + x.c + " *C.");
	}
}