package j;
import java.util.*;
class p
{
int f=0;
p(int n)
{
int i;
for (i=1; i<=n; i++)
if (n % i == 0)
f++;
if (f==2)
System.out.print("Prime");
else
System.out.print("Not prime.");
}
}
class v{
public static void main(String[] args)
{
System.out.print("Enter number: ");
Scanner a = new Scanner(System.in);
int r = a.nextInt();
p d = new p(r);
}
}