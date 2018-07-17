package j;
import java.util.*;
class abf
{
int i,n,nd,d,a,o;
void arms(int n)
{
this.n=n;
while(n>0)
{
n/=10;
nd++;
}
n=this.n;
while(n>0)
{
d=n%10;
o=d;
n/=10;
for (i=1; i<nd; i++)
d=o*d;
a+=d;
}
if (this.n == a)
System.out.println("Armstrong number.");
else
System.out.println("Not an Armstrong number.");
}
}
class dfg
{
public static void main(String[] args)
{
abf x = new abf();
int asa;
System.out.print("\nEnter number: ");
Scanner d = new Scanner(System.in);
asa = d.nextInt();
x.arms(asa);
}
}