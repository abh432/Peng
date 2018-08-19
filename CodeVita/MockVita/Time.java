import java.lang.Integer;
import java.util.Scanner;
class Clock
{
	public static void main(String[] args)
	{
		int g=-1,h=-1,l=-1,m=-1,r=-1,s=-1,c=1,i,j;
		int[] n = new int[9];
		String x;
		String[] w;
		Scanner y = new Scanner(System.in);
		x = y.next();
		w = x.split(",");
		for (i=0; i<9; i++)
		n[i] = Integer.valueOf(w[i]);
		for (i=0; i<9 && n[i]<3; i++);
		if (i<1)
			c=0;
		else
		{
			g = n[i-1];
			n[i-1] = -1;
		}
		if (c == 1 && g == 2)
		{
			for (; i<9 && n[i]<4; i++);
			if ( i < 2 )
				c=0;
			else
			{
				for (j=i-1; j>=0 && n[j] == -1; j--);
				h=n[j];
				n[j]=-1;
			}
			for (; i<9 && n[i]<6; i++);
			if (i<4)
				c=0;
			else
			{
				for (j=i-1; j>=0 && n[j] == -1; j--);
				l=n[j];
				n[j]=-1;
				for (j=i-1; j>=0 && n[j] == -1; j--);
				r=n[j];
				n[j]=-1;
			}
			for (j=8; j>=0 && n[j] == -1; j--);
			m=n[j];
			n[j]=-1;
			for (j=8; j>=0 && n[j] == -1; j--);
			s=n[j];
			n[j]=-1;
		}
else if ((g==0 || g==1) && c==1)
{
		for (; i<9 && n[i]<6; i++);
		if (i<3)
			c=0;
		else
		{
			for (j=i-1; j>=0 && n[j] == -1; j--);
			l=n[j];
			n[j]=-1;
			for (j=i-1; j>=0 && n[j] == -1; j--);
			r=n[j];
			n[j]=-1;
		}
		for (j=8; j>=0 && n[j] == -1; j--);
		h=n[j];
		n[j]=-1;
		for (j=8; j>=0 && n[j] == -1; j--);
		m=n[j];
		n[j]=-1;
		for (j=8; j>=0 && n[j] == -1; j--);
		s=n[j];
		n[j]=-1;
}
		if (c==0)
			System.out.print("Impossible");
		else
			System.out.print(g + "" + h + ":" + l + "" + m + ":" + r + "" + s);
	}
}