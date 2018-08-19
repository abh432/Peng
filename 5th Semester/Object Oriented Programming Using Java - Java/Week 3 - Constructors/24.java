class A
{
	int x = 0;
	A()
	{
		x = 9;
	}
}
class F
{
	public static void main(String[] args)
	{
		A w;
		w = new A();
		System.out.println(w.x);
	}
}