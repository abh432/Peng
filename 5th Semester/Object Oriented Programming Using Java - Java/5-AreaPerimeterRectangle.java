package w1;
class Shape
{
	double l,b,a,p;
	void calculateAreaAndPerimeter()
	{
		a = l * b;
		p = 2.0 * (l + b);
	}
}
class AreaPerimeter
{
	public static void main(String[] args)
	{
		Shape rectangle = new Shape();
		rectangle.l = 2;
		rectangle.b = 5;
		rectangle.calculateAreaAndPerimeter();
		System.out.println("");
		System.out.println(" The perimeter of the rectangle of length " + rectangle.l + " and breadth " + rectangle.b + " is: " + rectangle.p + ".");	
		System.out.println("");
		System.out.println(" The area of the rectangle of length " + rectangle.l + " and breadth " + rectangle.b + " is: " + rectangle.a + ".");	
	}
}