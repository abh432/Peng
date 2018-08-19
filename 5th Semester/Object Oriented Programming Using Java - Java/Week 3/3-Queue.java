import java.util.Scanner;
class Queue
{
	int f = -1, r = -1, n;
	int[] a;
	void allocate()
	{
		System.out.print("\n Enter size of queue: ");
		Scanner j = new Scanner(System.in);
		n = j.nextInt();
		a = new int[n];
	}	
	void push()
	{
		if (r < n - 1)
		{
			System.out.print("\n Enter element to be pushed into queue: ");
			Scanner d = new Scanner(System.in);
			if (f == -1)
				f++;
			r++;
			a[r] = d.nextInt();
			System.out.println("\n Element " + a[r] + " pushed into queue.");
		}
		else
			System.out.println("\n Queue overflow.");
	}
	int pop()
	{
		if (r == -1)
		{
			System.out.println("\n Queue underflow.");
			return -1;
		}
		else
		{
			if (f == r)
			{
				int u = a[r];
				f = -1;
				r = -1;
				return u;
			}
			else
			{
				f++;
				return a[f-1];
			}
		}
	}
	int peek()
	{
		if (r == -1)
		{
			System.out.println("\n Queue empty.");
			return -1;
		}
		else
			return a[r];	
	}
}
class QueueOperations
{
	public static void main(String[] args)
	{
		int x = 0, y;
		Scanner scg;
		scg = new Scanner(System.in);
		Queue l = new Queue();
		l.allocate();
		System.out.println("\n Operations on queue :-\n");
		System.out.println("\t 1. Push an element");
		System.out.println("\t 2. Pop an element");
		System.out.println("\t 3. Peek into queue (show rearmost element)");
		System.out.println("\t 4. Exit.");
		while (x != 4)
		{
			System.out.print("\n Please enter your choice (1-4): ");
			x = scg.nextInt();
			switch(x)
			{
				case 1: l.push();
					break;
				case 2: y = l.pop();
					if (y != -1)
						System.out.println("\n Element " + y + " deleted from queue.");
					break;
				case 3: y = l.peek();
					if (y != -1)
						System.out.println("\n Rearmost element in queue: " + y + ".");
					break;
				case 4: break;
				default: System.out.println("\n Invalid choice. Please try again.");
			}
		}
	}
}