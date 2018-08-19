import java.util.Scanner;
class Tender
{
	int cost;
	String companyName;
}
class New
{
	public static void main(String[] args)
	{
		Tender[] r = new Tender[5];
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter the details of 5 companies :-");
		for (i = 0; i < 5; i++)
		{
			r[i] = new Tender();
			System.out.print("\n Enter cost (" + (i + 1) + "/5): ");
			r[i].cost = s.nextInt();
			System.out.print("\n Enter company name (" + (i + 1) + "/5): ");
			r[i].companyName = s.nextLine();
			r[i].companyName = s.nextLine();
		}
		System.out.print("\n Name of company with minimum cost: ");
		int m = r[0].cost;
		for (i = 1; i < 5; i++)
			if (m > r[i].cost)
				m = r[i].cost;
		for (i = 0; i < 5; i++)
			if (m == r[i].cost)
				System.out.print(r[i].companyName + ", ");
		System.out.println("\b\b.");
	}
}