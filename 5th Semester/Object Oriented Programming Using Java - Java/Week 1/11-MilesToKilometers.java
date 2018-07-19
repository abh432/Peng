package w1;
class Distance
{
	double dist;
	void MilesToKilometers()
	{
		dist = dist * 1.60934;
	}
}
class Distance2
{
	public static void main(String[] args)
	{
		Distance c = new Distance();
		c.dist = 100;
		double x = c.dist;
		c.MilesToKilometers();
		System.out.println();
		System.out.println(" Distance (in miles): " + x + " = Distance (in kilometers): " + c.dist);
	}
}
	