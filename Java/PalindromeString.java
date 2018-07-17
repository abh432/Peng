package j;
import java.util.*;
import java.*;
class palin
{
palin(String s)
{
int i = s.length();
char[] p = s.toCharArray();
char[] q = s.toCharArray();
int k,j;
for (k = 0,j=i-1; k<i; k++,j--)
q[k]=p[j];
String s1=new String(p);
String s2=new String(q);
if (s1.equals(s2)==true)
System.out.println("Palindrome.");
else
System.out.println("Not a palindrome.");
}
}
class vb
{
public static void main(String[] args)
{
Scanner b = new Scanner(System.in);
System.out.print("\nEnter string: ");
String x = b.next();
palin j = new palin(x);
}
}