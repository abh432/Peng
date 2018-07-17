package j;
import java.util.Scanner;
class fg{
static int ab;
static int s(int y)
{
int o=l(y);
return o;
}
static int l(int x)
{
if (x == 1)
return 1;
else
{
ab=l(x-1);
return ab*x;
}
}
public static void main(String[] args)
{
Scanner z = new Scanner(System.in);
System.out.print("Enter number: ");
int a = z.nextInt();
a=s(a);
System.out.print(a);
}
}
