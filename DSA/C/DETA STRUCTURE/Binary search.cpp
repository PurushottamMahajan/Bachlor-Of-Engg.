///////Binary search/////
#include<stdio.h>
int main()
{
  int a[10],i,item,n,pos,beg=0,end,mid;
	printf("\n Enter an array");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
		n++;
	}
	printf("\n Enter an element for search");
		scanf("%d",&item);
		beg=0;
		end=n-1;
      	mid=(beg+end)/2;
	
	
	while(beg<=end && a[mid]!=item)
	{
		if(item<a[mid])
		{
			end=mid-1;
		}
		
		if(item>a[mid])
		{
		    beg=mid+1;
		}
		mid=(beg+end)/2;
		
	}
	if(a[mid]==item)
	{   pos=mid;
		printf("\n %d is found at %d position",item,mid);
	}
	else 
		printf("\n %d is not found in array ",item);
}
