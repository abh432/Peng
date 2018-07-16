package j;
public class PackageVariableTest0
{
public int v;
static int s;
public int gs(){
return s;}
public void ss(int s)
{
this.s=s;
}
public static void main(String[] args){
System.out.print(s);
}
}