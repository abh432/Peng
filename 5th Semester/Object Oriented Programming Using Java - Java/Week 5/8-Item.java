import java.util.Scanner;
class Item
{
	int code, price;
}
class New
{
	public static void main(String[] args)
	{
		Item[] r = new Item[5];
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter the details of 5 items :-");
		for (i = 0; i < 5; i++)
		{
			r[i] = new Item();
			System.out.print("\n Enter code (" + (i + 1) + "/5): ");
			r[i].code = s.nextInt();
			System.out.print("\n Enter price (" + (i + 1) + "/5): ");
			r[i].price = s.nextInt();
		}
		System.out.println("\n The code and price for the 5 items are as follows :-\n");
		System.out.println("\t S No. \t Price \t Code\n");
		for (i = 0; i < 5; i++)
			System.out.println("\t  " + (i + 1) + "  \t  " + r[i].price + "   \t   " + r[i].code);
		double p = 0.0;
		for (i = 0; i < 5; i++)
			p += r[i].price;
		System.out.println("\n Total price of all 5 items: " + p + ".");
	}
}