import java.util.Scanner;
class Student
{
String name;
int roll;
double sub1,sub2;
Student()
{
name = null;
roll = 0;
sub1 = 0.0;
sub2 = 0.0;
}
Student(String a, int b, double c, double d)
{
name = a;
roll = b;
sub1 = c;
sub2 = d;
}
void calculate(double d, double s)
{
double n = sub1 + sub2;
System.out.println("\n Total marks scored by student: " + n + ".");
double k = sub1/d + sub2/s;
k /= 2.0;
k *= 100;
System.out.println("\n Marks scored by student (in percentage): " + k + "%.");
}
void display()
{
System.out.println("\n Details of student :-\n");
System.out.println(" Name: " + name);
System.out.println(" Roll Number: " + roll);
System.out.println(" Marks in 1st subject: " + sub1);
System.out.println(" Marks in 2nd subject: " + sub2);
}
}
class Main
{
public static void main(String[] args)
{
Scanner h = new Scanner(System.in);
System.out.print("\n Enter name of student: ");
String nn = h.nextLine();
System.out.print("\n Enter roll number of student: ");
int rr = h.nextInt();
System.out.print("\n Enter marks in 1st subject of student: ");
double s1 = h.nextDouble();
System.out.print("\n Enter marks in 2nd subject of student: ");
double s2 = h.nextDouble();
Student g = new Student(nn,rr,s1,s2);
g.display();
System.out.print("\n Enter maximum marks in 1st subject: ");
double w1 = h.nextDouble();
System.out.print("\n Enter maximum marks in 2nd subject: ");
double w2 = h.nextDouble();
g.calculate(w1,w2);
}
}