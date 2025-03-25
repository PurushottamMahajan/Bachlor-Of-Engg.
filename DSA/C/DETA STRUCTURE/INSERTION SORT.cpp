//////INSERTION SORT////////
#include<stdio.h>
#define n 10
int main()
{
	 int a[n],k,t,i;
	printf("\n Enter an array");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	
	}
	for(k=1;k<n;k++)
	{
		
		t=a[k];
		for(i=k-1;i>=0 && a[i]>t;i--)
		{
			a[i+1]=a[i];
		}
	 a[i+1]=t;
	}
	printf("\nAfter insertion sort...\n");
		for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	
	}
	return 0;
}
