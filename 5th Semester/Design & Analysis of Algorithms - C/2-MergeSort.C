#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
void m(int [],int,int,int);
void ms(int a[],int p, int r)
{
int q;
if (p<r)
{
q=(p+r)/2;
ms(a,p,q);
ms(a,q+1,r);
m(a,p,q,r);
}
}
void m(int s[],int x, int y, int z)
{
int *t,i,j,k;
t = (int *)malloc((z - x +1)*sizeof(int));
i=k=x;
j=y+1;
while (i <= y && j <= z)
{
if (s[i]<=s[j])
{
t[k-x]=s[i];
k++;
i++;
}
else
{
t[k-x]=s[j++];
k++;
}
}
while (i<=y)
{
t[k-x]=s[i++];
k++;
}
while (j<=z)
{
t[k-x]=s[j++];
k++;
}
for (i=x; i<=z; i++)
s[i]=t[i-x];
}
void main()
{
int *aa,n,i;
clrscr();
printf("\n Enter the number of elements in the array: ");
scanf("%d",&n);
aa=(int *)malloc(n*sizeof(int));
printf("\n Enter the elements of the array :-\n");
for (i=0; i<n; i++)
{
printf("\n Enter element (%d/%d): ",i+1,n);
scanf("%d",&aa[i]);
}
ms(aa,0,n-1);
printf("\n The sorted array is as follows : ");
for (i=0; i<n; i++)
printf("%d, ",aa[i]);
printf("\b\b.");
getch();
}