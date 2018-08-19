class A
{
	int x;
	A(int o)
	{
		x = o;
	}
	A(int y, int o)
	{
		x = y;
	}
}
class B
{
	public static void main(String[] args)
	{
		A p = new A(8,6);
		System.out.println(p.x);
	}
}