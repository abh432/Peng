package w2;
import java.util.Scanner;
class NaturalNumbersSum
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.print("\n Enter number: ");
		int n = a.nextInt();
		int s = (int) (n * (n+1) / 2);
		System.out.println("\n Sum upto " + n + " natural numbers: " + s + ".");
	}
}