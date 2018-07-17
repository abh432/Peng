package j;
import java.util.Scanner;
class pal
{
int s,r;
pal(int s)
{
int d;
this.s=s;
while(s>0)
{
d=s%10;
s/=10;
r=r*10+d;
}
if (r==this.s)
System.out.print("Palindrome.");
else
System.out.print("Not a palindrome.");
}
}
class aa
{
public static void main(String[] args)
{
int x;
System.out.print("Enter a number: ");
Scanner a = new Scanner(System.in);
x=a.nextInt();
pal z = new pal(x);
}
}