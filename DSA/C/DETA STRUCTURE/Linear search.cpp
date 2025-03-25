#include<stdio.h>
#define n 10
int main()
{
	int a[n];
	int i,item;
	
	printf("\n Enter an array of ten elements");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n Enter an element for search in array");
	scanf("%d",&item);
	i=0;
	while(i<n)
	{
		if(a[i]==item)
		{
			printf("\n %d is found in array ata %d position",item,i);
			break;
		}	
		i++;
	}
	if(i==n)
	{
		printf("\n %d is not found in array",item);
	}
	
}




