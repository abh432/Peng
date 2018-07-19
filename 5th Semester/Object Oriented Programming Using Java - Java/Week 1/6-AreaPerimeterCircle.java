package w1;
class Shape1
{
	double r,a,p;
	void calculateAreaAndPerimeter()
	{
		a = 22.0 / 7.0 * r * r;
		p = 2.0 * 22.0 / 7.0 * r;
		
	}
}
class AreaPerimeter1
{
	public static void main(String[] args)
	{
		Shape1 circle = new Shape1();
		circle.r = 7;
		circle.calculateAreaAndPerimeter();
		System.out.println("");
		System.out.println(" The perimeter of the circle of radius " + circle.r + " is: " + circle.p + ".");
		System.out.println("");
		System.out.println(" The area of the circle of radius " + circle.r + " is: " + circle.a + ".");
	}
}