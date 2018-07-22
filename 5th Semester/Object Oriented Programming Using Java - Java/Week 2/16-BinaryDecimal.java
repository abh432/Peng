package w2;
import java.util.Scanner;
import java.lang.Math;
class Convert
{
	int D, B;
	void decimalToBinary()
	{
		int i = 0, k, q, r, u;
		q = D;
		while(q > 0)
		{
			u = 1;
			for (k = 0; k < i; k++)
				u *= 10;
			r = q % 2;
			q /= 2;
			B += (r * u);
			i++;
		}
		System.out.println("\n " + D + " (in decimal) = " + B + " (in binary).");
	}
	void binaryToDecimal()
	{
		int i = 0, n, b, u, k;
		b = B;
		D = 0;
		while(b > 0)
		{
			u = 1;
			for (k = 0; k < i; k++)
				u *= 2;
			n = b % 10;
			b /= 10;
			D += (n * u);
			i++;
		}
		System.out.println("\n " + B + " (in binary) = " + D + " (in decimal).");
	}
}
class MainClass3
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		System.out.print("\n Enter a decimal number: ");
		Convert z = new Convert();
		z.D = x.nextInt();
		z.decimalToBinary();		
		System.out.print("\n Enter a binary number: ");
		z.B = x.nextInt();
		z.binaryToDecimal();
	}
}