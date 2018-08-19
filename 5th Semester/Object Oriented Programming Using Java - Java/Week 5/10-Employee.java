import java.util.Scanner;
class Employee
{
	int empid, salary;
	String name;
}
class Nice
{
	public static void main(String[] args)
	{
		Employee[] r = new Employee[5];
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter the details of 5 employees :-");
		for (i = 0; i < 5; i++)
		{
			r[i] = new Employee();
			System.out.print("\n Enter employee ID (" + (i + 1) + "/5): ");
			r[i].empid = s.nextInt();
			System.out.print("\n Enter name (" + (i + 1) + "/5): ");
			r[i].name = s.nextLine();
			r[i].name = s.nextLine();
			System.out.print("\n Enter salary (" + (i + 1) + "/5): ");
			r[i].salary = s.nextInt();
		}
		System.out.println("\n The employee ID, name and salary of the 5 employees are as follows :-\n");
		System.out.println("\t S No. \t Employee ID \t Name \t Salary\n");
		for (i = 0; i < 5; i++)
			System.out.println("\t  " + (i + 1) + "  \t  " + r[i].empid + "        \t   " + r[i].name + "  \t  " + r[i].salary);
	}
}