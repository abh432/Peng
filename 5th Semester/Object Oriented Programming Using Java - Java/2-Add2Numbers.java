package w1;
class Add
{
	int a,b;
}
class Addition
{
	public static void main(String[] args)
	{
		Add x = new Add();
		x.a = 2;
		x.b = 4;
		int s = x.a + x.b;
		System.out.println("");
		System.out.println(" The sum of the 2 numbers " + x.a + " and " + x.b + " is: " + s + ".");
	}
}