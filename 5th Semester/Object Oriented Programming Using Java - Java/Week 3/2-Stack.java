import java.util.Scanner;
class Stack
{
	int top = -1, n;
	int[] a;
	void allocate()
	{
		System.out.print("\n Enter size of stack: ");
		Scanner f = new Scanner(System.in);
		n = f.nextInt();
		a = new int[n];
	}	
	void push()
	{
		if (top < n - 1)
		{
			System.out.print("\n Enter element to be pushed into stack: ");
			Scanner d = new Scanner(System.in);
			top = top + 1;
			a[top] = d.nextInt();
			System.out.println("\n Element " + a[top] + " pushed into stack.");
		}
		else
			System.out.println("\n Stack overflow.");
	}
	int pop()
	{
		if (top == -1)
		{
			System.out.println("\n Stack underflow.");
			return -1;
		}
		else
		{
			--top;
			return a[top + 1];
		}
	}
	int peek()
	{
		if (top == -1)
		{
			System.out.println("\n Stack empty.");
			return -1;
		}
		else
			return a[top];
	}
}
class StackOperations
{
	public static void main(String[] args)
	{
		int x = 0, y;
		Scanner scg;
		scg = new Scanner(System.in);
		Stack l = new Stack();
		l.allocate();
		System.out.println("\n Operations on stack :-\n");
		System.out.println("\t 1. Push an element");
		System.out.println("\t 2. Pop an element");
		System.out.println("\t 3. Peek into stack (show topmost element)");
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
						System.out.println("\n Element " + y + " deleted from stack.");
					break;
				case 3: y = l.peek();
					if (y != -1)
						System.out.println("\n Topmost element in stack: " + y + ".");
					break;
				case 4: break;
				default: System.out.println("\n Invalid choice. Please try again.");
			}
		}
	}
}