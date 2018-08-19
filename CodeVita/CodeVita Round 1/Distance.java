import java.util.Scanner;
import java.lang.Integer;
class Distance
{
public static void main(String[] args)
{
String h;
int l11, l12=0, l21, l22=0;
double s,a,m,f1,f2,u11,u12,u21,u22,a11,a12,a21,a22,s11,s12,s21,s22,v11,v12,v21,v22,t=1.0;
Scanner d = new Scanner(System.in);
h=d.nextLine();
String[] l = h.split(" ");
l11 = Integer.valueOf(l[0]);
l21 = Integer.valueOf(l[1]);
if (l11>=1 && l21<=50 && l11 < l21)
{
f1 = (10.0*l11*l21)/((l21-l11)*(l21-l11));
a11=f1/l11;
a21=f1/l21;
s11=u11+a11/2;
s21=u21+a21/2;
v11=u11+a11;
v21=u21+a21;
u12=v11;
u22=v21;
a = s11-(int)s11;
if (a<0.5)
l12=l11+(int)s11;
else
l12=l11+(int)s11+1;
a = s21-(int)s21;
if (a<0.5)
l22=l21+(int)s21;
else
l22=l21+(int)s21+1;
f2 = (10.0*l12*l22)/((l22-l12)*(l22-l12));
a12=f1/l11;
a22=f1/l21;
s12=u11+a11/2;
s22=u21+a21/2;
v12=u11+a11;
v22=u21+a21;
while (l12<l22)
{
f1=f2;
l11=l12;
l21=l22;
u11=u12;
u21=u22;
v11=v12;
v21=v22;
a11=a12;
a21=a22;
s11=s12;
s21=s22;
u12=v11;
u22=v21;
a = s11-(int)s11;
if (a<0.5)
l12=l11+(int)s11;
else
l12=l11+(int)s11+1;
a = s21-(int)s21;
if (a<0.5)
l22=l21+(int)s21;
else
l22=l21+(int)s21+1;
f2 = (10.0*l12*l22)/((l22-l12)*(l22-l12));
a12=f1/l11;
a22=f1/l21;
s12=u11+a11/2;
s22=u21+a21/2;
v12=u11+a11;
v22=u21+a21;
}
s=(l11+l12+l21+l22)/4;
if (s<l21)
m=s;
else
{
while(s<l21)
{
t=t/2;
s12=u11*t+a11*t*t/2;
s22=u21*t+a21*t*t/2;
v12=u11+a11*t;
v22=u21+a21*t;
s=(l11+l12+l21+l22)/4;
}
m=s;
}
System.out.print(s);
}
}
}