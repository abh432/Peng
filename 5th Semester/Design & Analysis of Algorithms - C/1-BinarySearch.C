#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int binsearch(int a[],int l, int h, int k)
{
int m=0,n;
if (l>h)
return -1;
else
{
m=(l+h)/2;
if (a[m] == k)
return m;
else if (k < a[m])
{
n=binsearch(a,l,m-1,k);
return n;
}
else
{
n=binsearch(a,m+1,h,k);
return n;
}
}
}
void main()
{
int *aa,n,p,i,x;
clrscr();
printf("\n Enter the number of elements in the array: ");
scanf("%d",&n);
aa=(int *)malloc(n*sizeof(int));
printf("\n Enter the elements of the sorted array :-\n");
for (i=0; i<n; i++)
{
printf("\n Enter element (%d/%d): ",i+1,n);
scanf("%d",&aa[i]);
}
printf("\n Enter the element to be searched: ");
scanf("%d",&x);
p=binsearch(aa,0,n-1,x);
if (p==-1)
printf("\n Element %d not found in the array.",x);
else
printf("\n Element %d found at position %d in the array.",x,p+1);
getch();
}
