package j;
class x{
int r,s;
void fbnc(int g)
{
int i,j;
r=s=1;
System.out.print("1, ");
for (i=1;i<g; i++)
{
System.out.print(s+", ");
j=s;
s+=r;
r=j;
}
System.out.print("\b\b.");
}
}
class d
{
public static void main(String[] args)
{
x ob = new x();
ob.fbnc(12);
}
}