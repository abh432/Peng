import java.util.Scanner;
import java.lang.Math;
class Inversion
{
public static void main(String[] args)
{
int N;
Scanner sc = new Scanner(System.in);
N=sc.nextInt();
if (N<=50)
{
int i;
String h = sc.next();
String[] w = h.split(",");
int[] x = new int[N];
for (i = 0; i<N; i++)
{
int c =0;
h=w[i];
int d = Integer.valueOf(h);
int j = 0, k, q, r, u, B = 0;
		q=d;
		while(q > 0)
		{
			u = 1;
			for (k = 0; k < j; k++)
				u *= 10;
			r = q % 2;
			q /= 2;
			B += (r * u);
			j++;
		}
while (B>0)
{
u = B % 10;
if (u==1)
c++;
B/=10;
}
x[i]=c;
}
int lo = 0;
int j;
for (i = 0; i <N; i++)
for (j = 0; j<N;j++)
if (i<j && x[i]<x[j])
lo++;
System.out.print(lo);
}
}
}