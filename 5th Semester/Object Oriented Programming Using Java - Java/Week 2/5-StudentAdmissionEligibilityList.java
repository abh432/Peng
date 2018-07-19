package w2;
import java.util.Scanner;
class Student
{
	int m,p,c;
	String name;
	int check()
	{
		if (m >= 60 && p >= 50 && c >= 40  && ((m + p + c) >= 200 || (m+p) >= 150))
			return 1;
		else
			return 0;
	}
}
class Course
{
	public static void main(String[] args)
	{
		int n,i,o;
		String e = "";
		Student a = new Student();
		Scanner d = new Scanner(System.in);
		System.out.print("\n Enter the number of students: ");
		n = d.nextInt();
		for (i = 1; i <= n; i++)
		{
			System.out.println("\n Enter details of student " + i + " :-\n");
			System.out.print(" Name: ");
			a.name = d.nextLine();
			a.name = d.nextLine();
			System.out.print(" Marks in Mathematics: ");
			a.m = d.nextInt();
			System.out.print(" Marks in Physics: ");
			a.p = d.nextInt();
			System.out.print(" Marks in Chemistry: ");
			a.c = d.nextInt();
			o = a.check();
			if (o == 1)
			{
				e = e.concat(a.name);
				e = e.concat(", ");
			}
		}
		if (e.equals("") == true)
			System.out.println("\n No students eligible for admission.");
		else
			System.out.println("\n Eligibility list of students for admission in the course is as follows: " + e + "\b\b.");
		
	}
}