/////////////////////TRY TO IMPLEMENT QUICK SORT/////////////////////////////////////
#include<stdio.h>
#define n 10
int pivot,i,j;
int a[n];
int part(int,int);
int sort(int,int);
void display();
int main()
{
     printf("\nEnter ten element to sort");
     for(i=0;i<n;i++)
    {
	     scanf("%d",&a[i]);
    }
   part(0,n-1);
   printf("\n \n\n\nFinally");
 display();
  
}
 int sort(int x,int y) 
{  int temp,p;
      while(i<j)
	  {
         while(a[i]<=a[pivot])
            i++;
         while(a[j]>a[pivot])
            j--;
         if(i<j)
		 {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
         }
      }
      
      temp=a[pivot];
      a[pivot]=a[j];
      a[j]=temp;
      printf("\n After a last itteration");
      display();
    j=part(x,j-1);
    j=part(j+1,y);
}
int part(int x,int y)
{  
	 if(x<y)
	 {
      pivot=x;
      i=x;
      j=y;
     sort(x,y);
     }	 
}
void display()
{
 printf("\nSorted elements: ");
   for(i=0;i<n;i++)
      printf(" %d",a[i]);
  }
