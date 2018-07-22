package w2;
import java.util.Scanner;
class Lcm
{
	public static void main(String[] args)
	{
		int u = 1, m, i;
		Scanner q = new Scanner(System.in);
		System.out.print("\n Enter number 1: ");
		int h = q.nextInt();
		System.out.print("\n Enter number 2: ");
		int l = q.nextInt();
		if (l < h)
			m = h;
		else
			m = l;
		for (i = m; i <= h * l; i++)
			if (i % h == 0 && i % l == 0)
			{
				u = i;
				break;
			}
		System.out.println("\n The LCM of the 2 numbers " + h + " and " + l + " is: " + u + ".");
	}
}