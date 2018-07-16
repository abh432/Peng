package d1;
class Shape
{
	double v1,v2,a,p;
	int c;
	void calculateAreaAndPerimeter()
	{
		if (c == 1)
		{
			a = v1 * v1;
			p = 4.0 * v1;
		}
		else if (c == 2)
		{		
			a = v1 * v2;
			p = 2.0 * (v1 + v2);
		}
		else if (c == 3)
		{		
			a = 22.0 / 7.0 * v1 * v1;
			p = 2.0 * 22.0 / 7.0 * v1;
		}
		else if (c == 4)
		{
			p = 3.0 * v1;
			a = v1 * v2 / 2.0;
		}
	}
}
class AreaPerimeter
{
	public static void main(String[] args)
	{
		Shape square = new Shape();
		Shape rectangle = new Shape();
		Shape circle = new Shape();
		Shape triangle = new Shape();
		square.c = 1;
		rectangle.c = 2;
		circle.c = 3;
		triangle.c = 4;
		square.v1 = 4;
		rectangle.v1 = 2;
		rectangle.v2 = 5;
		circle.v1 = 7;
		triangle.v1 = 1;
		triangle.v2 = 2;
		square.calculateAreaAndPerimeter();
		rectangle.calculateAreaAndPerimeter();
		circle.calculateAreaAndPerimeter();
		triangle.calculateAreaAndPerimeter();
		System.out.println("");
		System.out.println(" The perimeter of the square of side " + square.v1 + " is: " + square.p + ".");
		System.out.println("");
		System.out.println(" The area of the square of side " + square.v1 + " is: " + square.a + ".");
		System.out.println("");
		System.out.println(" The perimeter of the rectangle of length " + rectangle.v1 + " and breadth " + rectangle.v2 + " is: " + rectangle.p + ".");	
		System.out.println("");
		System.out.println(" The area of the rectangle of length " + rectangle.v1 + " and breadth " + rectangle.v2 + " is: " + rectangle.a + ".");	
		System.out.println("");
		System.out.println(" The perimeter of the circle of radius " + circle.v1 + " is: " + circle.p + ".");
		System.out.println("");
		System.out.println(" The area of the circle of radius " + circle.v1 + " is: " + circle.a + ".");
		System.out.println("");
		System.out.println(" The perimeter of the triangle of breadth " + triangle.v1 + " and height " + triangle.v2 + " is: " + triangle.p + ".");
		System.out.println("");
		System.out.println(" The area of the triangle of breadth " + triangle.v1 + " and height " + triangle.v2 + " is: " + triangle.a + ".");		
		System.out.println("");
	}
}