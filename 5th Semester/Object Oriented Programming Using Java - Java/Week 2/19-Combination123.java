package w2;
class Combination
{
	public static void main(String[] args)
	{
		int i, j, k;
		System.out.println("\n All possible combinations of 1, 2 and 3 :-\n");
		for (i = 1; i <= 3; i++)
			for (j = 1; j <= 3; j++)
				for (k = 1; k <= 3; k++)
					if (i != j && j != k && i != k)
						System.out.println(i + "" + j + "" + k);
	}
}