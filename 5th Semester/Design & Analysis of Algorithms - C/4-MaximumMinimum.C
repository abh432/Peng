#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int max,min;
void mm(int a[], int i, int j)
{
	int max1,min1,mid;
	if (i==j)
		max=min=a[i];
	else if (i == j-1)
	{
		if (a[i] < a[j])
		{
			max = a[j];
			min = a[i];
		}
		else
		{
			max = a[i];
			min = a[j];
		}
	}
	else
	{
		mid = (i+j)/2;
		mm(a,i,mid);
		max1=max;
		min1=min;
		mm(a,mid+1,j);
		if (max1>max)
			max = max1;
		if (min1<min)
			min = min1;
	}
}
void main()
{
	int i,*x,c;
	clrscr();
	printf("\n Enter the number of elements in the array: ");
	scanf("%d",&c);
	x = (int *)malloc(c*sizeof(int));
	printf("\n\n Enter the elements of the array :-\n\n");
	for (i = 0; i<c; i++)
	{
		printf("\n Enter element (%d/%d): ",i+1,c);
		scanf("%d",&x[i]);
	}
	mm(x,0,c-1);
	printf("\n The maximum and minimum elements in the array 	are: %d and %d, respectively.",max,min);
	getch();
}