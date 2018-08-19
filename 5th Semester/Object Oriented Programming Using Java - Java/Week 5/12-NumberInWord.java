import java.util.Scanner;
class PrintInteger
{
	void printNumberInWord(int c)
	{
		switch(c)
		{
			case 1: System.out.println("\n ONE");
				break;
			case 2: System.out.println("\n TWO");
				break;
			case 3: System.out.println("\n THREE");
				break;
			case 4: System.out.println("\n FOUR");
				break;
			case 5: System.out.println("\n FIVE");
				break;
			case 6: System.out.println("\n SIX");
				break;
			case 7: System.out.println("\n SEVEN");
				break;
			case 8: System.out.println("\n EIGHT");
				break;
			case 9: System.out.println("\n NINE");
				break;
			case 0: System.out.println("\n ZERO");
				break;
			default: System.out.println("\n Value entered is not a digit.");
		}
	}
	public static void main(String[] args)
	{
		int y;
		Scanner x = new Scanner(System.in);
		System.out.print("\n Enter a digit: ");
		y = x.nextInt();
		printNumberInWord(y);
	}
}