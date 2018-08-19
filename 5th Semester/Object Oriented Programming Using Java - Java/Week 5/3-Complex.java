import java.util.Scanner;
class Complex
{
int r,i;
Complex add(Complex a)
{
Complex v = new Complex();
v.r = a.r + r;
v.i = a.i + i;
return v;
}
}
class Main
{
public static void main(String[] args)
{
Complex a,b,c;
a = new Complex();
b = new Complex();
c = new Complex();
Scanner x = new Scanner(System.in);
System.out.print("\n Enter the real value of the 1st complex number: ");
a.r = x.nextInt();
System.out.print("\n Enter the imaginary value of the 1st complex number: ");
a.i = x.nextInt();
System.out.print("\n Enter the real value of the 2nd complex number: ");
b.r = x.nextInt();
System.out.print("\n Enter the imaginary value of the 2nd complex number: ");
b.i = x.nextInt();
c = a.add(b);
System.out.println("\n The sum of the 2 complex numbers is: " + c.r + " + " + c.i + "i.");
}
}