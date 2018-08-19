class A
{
	int x;
	A(int o)
	{
		x = o;
	}
}
class B
{
	public static void main(String[] args)
	{
		A p = new A(6);
		System.out.println(p.x);
	}
}