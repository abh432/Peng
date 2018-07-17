package j;
class c{
int s=1,cu=2;
void fbn(int r)
{
System.out.print(s+", ");
int k = s;
s+=r;
if (cu<12)
{
cu++;
fbn(k);
}
}
}
class  w{
public static void main(String[] args)
{
c x = new c();
System.out.print("1, ");
x.fbn(1);
System.out.print("\b\b.");
}
}