
//////ARRAY IS SORTED OR NOT/////////
#include<stdio.h>
int main()
{
	int a[10],i,n=10;
	printf("\n Enter an array with 10 elements");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
	}
	i=0;
	while(i<n)
	{   
	    if(a[i]<=a[i+1])
        	{
			i++;
            }
        else{
	         	break;
            }
	}
	
if(i<n-1)
	{
		printf("\n Array is in ascending sorted");
	}
   else{
         printf("\nunsorted ");
     }
}
