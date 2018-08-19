import java.util.*;
class InverseBase6
{
public static void main(String[] args)
{
int N;
Scanner sc = new Scanner(System.in);
N=sc.nextInt();
if (N<=50)
{
int i,j;
String h = sc.next();
String[] w = h.split(",");
int[] x = new int[N];
for (i = 0; i<N; i++)
{
h=w[i];
int d = Integer.valueOf(h);
int v = d,k,l=0,c=0;
while(v>0)
{
k = v%6;
v/=6;
l+=k;
}
x[i]=l;
if (l>107)
System.exit(0);
}
int c=0,i1;
for (i1=0; i1<N-1; i1++)
for (j=i1+1; j<N; j++)
if (x[i1]>x[j])
c++;
System.out.print(c);
}
}
}