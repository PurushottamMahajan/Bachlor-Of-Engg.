#include <stdio.h>
#define n 10
int main()
{
   int i,j,temp,flag;
   int a[n];
    printf("\nenter the the array element");
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
   for(i=1;i<=n-i;i++)
   {flag=0;
      for(j=0;j<n-1;j++)
       {   if(a[j]>a[j+1])
           {
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
               
              flag=1;
           } 
       }
        if(flag==0)
           {
            printf("break\n");
           break;
           }
    }
   for(i=0;i<=n-1;i++)
   printf("%d\t",a[i]);
}
