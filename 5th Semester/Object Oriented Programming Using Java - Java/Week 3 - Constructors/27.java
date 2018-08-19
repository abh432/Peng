import java.util.Scanner;
class Grader
{
	int score;
	Grader(int x)
	{
		score = x;
	}
	char letterGrade()
	{
		if  (score > 90)
			return 'O';
		else if  (score > 80)
			return 'E';
		else if  (score > 70)
			return 'A';
		else if  (score > 55)
			return 'B';
		else if  (score > 40)
			return 'C';
		else
			return 'F';
	}
}
class Main12
{
	public static void main(String[] args)
	{
		int u;
		System.out.print("\n Enter the score: ");
		Scanner c = new Scanner(System.in);
		u = c.nextInt();
		if (u > 0 && u <= 100)
		{
			Grader h = new Grader(u);
			System.out.println("\n The grade for the score " + u + " is: " + h.letterGrade() + ".");
		}
		else
			System.out.println("\n Invalid Score.");
	}
}