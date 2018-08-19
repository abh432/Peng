import java.util.Scanner;
class Circle
{
	private double radius;
	private String color;
	Circle()
	{
		radius = 1.0;
		color = "red";
	}
	Circle(double d)
	{
		radius = d;
		color = "red";
	}
	double getRadius()
	{
		return radius;
	}
	double getArea()
	{
		return ((22.0 / 7.0) * radius * radius);
	}
}
class Due
{
	public static void main(String[] args)
	{
		double c;
		Circle x = new Circle();
		System.out.println("\n Radius of circle x: " + x.getRadius() + ".");
		System.out.println("\n Area of circle x: " + x.getArea() + ".");
		Scanner j =new Scanner(System.in);
		System.out.print("\n Enter the radius of circle y: ");
		c = j.nextDouble();
		Circle y = new Circle(c);
		System.out.println("\n Radius of circle y: " + y.getRadius() + ".");
		System.out.println("\n Area of circle y: " + y.getArea() + ".");
	}
}