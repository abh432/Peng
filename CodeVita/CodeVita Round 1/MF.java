import java.util.Scanner;
import java.lang.Integer;
class Fibonacci
{
public static void main(String[] args)
{
int t,n,k,i,rs;
int[] a;
long p=1L;
String h;
String[] l = new String[100];
Scanner d = new Scanner(System.in);
t=d.nextInt();
h=d.nextLine();
h=d.nextLine();
System.out.println(h);
l = h.split(" ");
n = Integer.valueOf(l[0]);
k = Integer.valueOf(l[1]);
a = new int[k];
h=d.nextLine();
h=d.nextLine();
System.out.println(h);
l = h.split(" ");
for (i=0; i<k; i++)
a[i] = Integer.valueOf(l[i]);
for (i=0; i<k; i++)
p*=a[i];
rs = p % 1000000007;
System.out.print(rs + "\n");
System.out.print("\b");
}
}