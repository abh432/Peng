import java.util.Scanner;
class Time
{
int h, m, s;
Time add(Time a)
{
Time y = new Time();
y.s=s+a.s;
if (y.s>59)
{
y.s-=60;
a.m+=1;
}
y.m=m+a.m;
if (y.m>59)
{
y.m-=60;
a.h+=1;
}
y.h=h+a.h;
return y;
}
}
class Main
{
public static void main(String[] args)
{
Time a,b,c;
a = new Time();
b = new Time();
c = new Time();
Scanner x = new Scanner(System.in);
System.out.print("\n Enter hour part of time 1: ");
a.h = x.nextInt();
System.out.print("\n Enter minute part of time 1: ");
a.m = x.nextInt();
System.out.print("\n Enter second part of time 1: ");
a.s = x.nextInt();
System.out.print("\n Enter hour part of time 2: ");
b.h = x.nextInt();
System.out.print("\n Enter minute part of time 2: ");
b.m = x.nextInt();
System.out.print("\n Enter second part of time 2: ");
b.s = x.nextInt();
c = a.add(b);
System.out.println("\n The resultant time is: " +c.h + ":"+c.m+":"+c.s+".");
}
}
 