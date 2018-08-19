import java.lang.Math;
import java.util.Scanner;
class Earth
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, di;
		int N = sc.nextInt();
		double d=0;
		if (N <= 10)
		{
			String c = sc.next();
			String[] k = c.split(",");
			String h = k[0];
			String j = k[1];
			char w = h.charAt(h.length()-1);
			char e = j.charAt(j.length()-1);
			h = h.replace("S","");
			h = h.replace("N","");
			int x = Integer.valueOf(h);
			j = j.replace("E","");
			j = j.replace("W","");
			int y = Integer.valueOf(j);
			if (w == 'S')
				x = - x;
			if (e == 'W')
				y = - y;
			double ns = 0.0174533 * x;
			double ew = 0.0174533 * y;
			for (i = 2; i <= N; i++)
			{
				c = sc.next();
				k = c.split(",");
				h = k[0];
				j = k[1];
				w = h.charAt(h.length() - 1);
				e = j.charAt(j.length() - 1);
				h = h.replace("S","");
				h = h.replace("N","");
				x = Integer.valueOf(h);
				j = j.replace("E","");
				j = j.replace("W","");
				y = Integer.valueOf(j);
				if (w == 'S')
					x = - x;
				if (e == 'W')
					y = - y;
				double ns2 = 0.0174533 * x;
				double ew2 = 0.0174533 * y;
				double t1,t2,t3;
				t1 = (ns2 - ns)/2;
				t1 = Math.sin(t1);
				t1 = t1 * t1;
				t2 = Math.cos(ns) * Math.cos(ns2);
				t3 = (ew2 - ew)/2;
				t3 = Math.sin(t3);
				t3 = t3 * t3;
				double t;
				t = t1 + t2 * t3;
				t = Math.sqrt(t);
				t = Math.asin(t);
				t *= 2;
				double d1 = t * 6400;
				ns = ns2;
				ew = ew2;
				d += d1;
			}
			di = (int) Math.round(d);
			System.out.print(di);
		}
	}
}