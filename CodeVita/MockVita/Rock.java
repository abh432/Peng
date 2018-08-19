import java.lang.Integer;
import java.util.Scanner;
class Rock
{
public static void main(String[] args)
{
Scanner w = new Scanner(System.in);
int i,S,R,r1,r2,j,y;
String[] a,h;
h=new String[2];
String b,c;
b=w.nextLine();
h=b.split(" ");
S=Integer.valueOf(h[0]);
R=Integer.valueOf(h[1]);
b=w.nextLine();
a=new String[S];
a=b.split(" ");
int s[]=new int[S];
int r[] = new int[R];
for (i=0; i<S; i++)
s[i]=Integer.valueOf(a[i]);
for (i=0; i<R; i++)
{
y = 0;
b=w.nextLine();
h=b.split(" ");
r1=Integer.valueOf(h[0]);
r2=Integer.valueOf(h[1]);
for (j=0; j<S; j++)
if (s[j]>=r1 && s[j] <= r2)
y++;
r[i]=y;
}
for (i=0;i<R;i++)
System.out.println(r[i]);
}
}
