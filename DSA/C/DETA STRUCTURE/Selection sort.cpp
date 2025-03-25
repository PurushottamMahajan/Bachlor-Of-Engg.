#include<stdio.h>
#define n 10
int main()
{
	int a[n],k,i,pos,temp;
		printf("\n Enter 10 elements in array");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
    }
		for(k=0;k<n-1;k++)
		{
			pos=k;
			i=k+1;
			while(i<=n-1)
			{
				if(a[i] < a[pos])
				  pos=i;
			   i++;	  
			}
			temp=a[k];
			a[k]=a[pos];
			a[pos]=temp;			
		}
		
   for(i=0;i<n;i++)
   printf("%d\t",a[i]);
}
