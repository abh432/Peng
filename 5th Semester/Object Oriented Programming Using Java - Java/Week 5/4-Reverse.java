import java.util.Scanner;
class Number2
{
	int h,t,o,m;
	Number2(int a, int b, int c)
	{
		h = a;
		t = b;
		o = c;
		m = h*100 + t*10 +o;
	}
	void reverse()
	{
		int r = 0, d, n;
		n = m;
		while(n > 0)
		{
			d = n % 10;
			n = n / 10;
			r = r * 10 + d;
		}
		System.out.println("\n The reverse of the number " + m + " is: " + r + ".");
	}
}
class Reverse
{
public static void main(String[] args)
{
Number2 x;
int u,v,y;
Scanner w;
w = new Scanner(System.in);
System.out.print("\n Enter the hundreds digit of the number: ");
u = w.nextInt();
System.out.print("\n Enter the tens digit of the number: ");
v = w.nextInt();
System.out.print("\n Enter the ones digit of the number: ");
y = w.nextInt();
x = new Number2(u,v,y);
x.reverse();
}
}