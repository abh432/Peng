package w1;
class Marks
{
	double percentage;
	char grade;
	void calculateGrade()
	{
		if ( percentage > 90 || percentage == 90)
			grade = 'A';
		else if ( percentage > 80 || percentage == 80)
			grade = 'B';
		else if ( percentage > 70 || percentage == 70)
			grade = 'C';
		else if ( percentage > 60 || percentage == 60)
			grade = 'D';
		else if ( percentage > 40 || percentage == 40)
			grade = 'E';
		else
			grade = 'F';
	}
}
class GradingSystem
{
	public static void main(String[] args)
	{
		Marks w = new Marks();
		w.percentage = 65.54;
		w.calculateGrade();
		System.out.println();
		System.out.println(" The grade for " + w.percentage + " % marks is: " + w.grade + ".");
	}
}