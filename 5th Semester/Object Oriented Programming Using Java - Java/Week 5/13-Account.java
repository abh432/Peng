import java.util.Scanner;
class Account
{
	private int id;
	private double balance;
	private String dateCreated;
	private static double annualInterestRate = 0.0;
	Account()
	{
		id = 0;
		balance = 0.0;
		dateCreated = "19-08-2018";
	}
	Account(int y, double t)
	{
		id = y;
		balance = t;
		dateCreated = "19-08-2018";
	}
	void set(int a, double s, double d)
	{
		id = a;
		balance = s;
		annualInterestRate = d;
	}
	void get()
	{
		System.out.print("\n Annual Interest Rate: " + annualInterestRate);
		System.out.print("\n Balance: " + balance);
		System.out.print("\n ID: " + id);
	}
	String getDate()
	{
		return dateCreated;
	}
	double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	double getMonthlyInterest()
	{
		return balance * annualInterestRate / 12;
	}
	void withdraw(double amt)
	{
		balance -= amt;
		System.out.println("\n " + amt + " rupees withdrawn from account. Current account balance: " + balance + ".");
	}
	void deposit(double amt)
	{
		balance += amt;
		System.out.println("\n " + amt + " rupees deposited into account. Current account balance: " + balance + ".");
	}
}
class TestDrive
{
	public static void main(String[] args)
	{
		Scanner v = new Scanner(System.in);
		Account u = new Account();
		int a;
		double b,c;
		System.out.print("\n Enter ID: ");
		a = v.nextInt();
		System.out.print("\n Enter Balance: ");
		b = v.nextDouble();
		Account x = new Account(a,b);
		System.out.print("\n Enter Annual Interest Rate: ");
		c = v.nextDouble();
		x.set(a,b,c);
		System.out.print("\n Enter amount to be withdrawn: ");
		c = v.nextDouble();
		x.withdraw(c);
		System.out.print("\n Enter amount to be deposited: ");
		c = v.nextDouble();
		x.deposit(c);
		x.get();
		System.out.print("\n Date Created: " + x.getDate());
		System.out.print("\n Monthly Interest Rate: " + x.getMonthlyInterestRate());
		System.out.print("\n Monthly Interest: " + x.getMonthlyInterest());
	}
}