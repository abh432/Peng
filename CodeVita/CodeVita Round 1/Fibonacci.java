import java.util.Scanner;
import java.lang.Integer;
import java.math.BigInteger;
class Fibonacci
{
public static void main(String[] args)
{
int t,n,k,i,j,m = 1000000007,b;
int[] a;
BigInteger p;
String h,u = "";
String[] l = new String[100];
Scanner d = new Scanner(System.in);
t=d.nextInt();
h=d.nextLine();
if (t<=10)
{
for (b=1; b<=t; b++)
{
h=d.nextLine();
l = h.split(" ");
n = Integer.valueOf(l[0]);
k = Integer.valueOf(l[1]);
a = new int[n];
h=d.nextLine();
l = h.split(" ");
if (n>=1 && n <= 1000000 && k >=1 && k<=10)
{
for (i=0; i<k; i++)
a[i] = Integer.valueOf(l[i]);
for (; i<n; i++)
{
p= new BigInteger("1");
for (j=i-k; j<i; j++)
p=new BigInteger(p.multiply(BigInteger.valueOf(a[j])).toString()); 
a[i] = (p.mod(BigInteger.valueOf(m))).intValue();
}
u = u + Integer.toString(a[n-1]) + "\n";
}
}
System.out.print(u + "\b");
}
}
}