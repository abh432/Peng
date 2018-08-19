import java.util.Scanner;
import java.lang.Math;
class Point
{
	double x, y;
}
class Circle
{
	Point x1, x2;
	double r, ar;
	void calculate()
	{
		r = Math.sqrt((x1.x - x2.x) * (x1.x - x2.x) + (x1.y - x2.y) * (x1.y - x2.y));
		r /= 2.0;
		ar = (22.0 / 7.0) * r * r;
	}
	Circle(Point a, Point b)
	{
		x1 = new Point();
		x2 = new Point();
		x1 = a;
		x2 = b;
	}
}
class Mhx
{
	public static void main(String[] args)
	{
		Point u, v;
		u = new Point();
		v = new Point();
		System.out.print("\n Enter the x coordinate of the 1st point: ");
		Scanner w = new Scanner(System.in);
		u.x = w.nextDouble();
		System.out.print("\n Enter the y coordinate of the 1st point: ");
		u.y = w.nextDouble();
		System.out.print("\n Enter the y coordinate of the 2nd point: ");
		v.y = w.nextDouble();
		System.out.print("\n Enter the y coordinate of the 2nd point: ");
		v.y = w.nextDouble();
		Circle l = new Circle(u,v);
		l.calculate();
		System.out.println("\n The area of the circle is: " + l.ar + ".");
	}
}