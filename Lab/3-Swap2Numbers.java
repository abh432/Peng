package d1;
class Swap
{
	int a,b;
	void swap()
	{
		a = a + b;
		b = a - b;
		a = a - b;
	}
}
class Swapping
{
	public static void main(String[] args)
	{
		Swap x = new Swap();
		x.a = 4;
		x.b = 3;
		System.out.println("");
		System.out.println(" Before swapping: a = " + x.a + ", b = " + x.b + ".");
		x.swap();
		System.out.println("");
		System.out.println(" After swapping: a = " + x.a + ", b = " + x.b + ".");
		System.out.println("");
	}
}