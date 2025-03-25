///////COMBINE PROGRAM IN MODULES FOR SORTING METHODS////////
#include<stdio.h>
int n=10;
int a[n];
int i,k,t;
void input();
void bubble();
void select();
void ins_sort();
void output();
int main()
{ int ch;
input();

	do 
	{
		printf("\n \t\t\tMENU\n Choose a sorting method ....");
		printf("\n1-Bubble sort\n2-Selection sort\n3-Insertiom sort\n4Exit");
		scanf("%d",&ch);
	
			switch(ch)
   	   {
   	 	case 1:bubble();break;
   	 	case 2:select();break;
   	 	case 3:ins_sort();break;
   	 	case 4:;break;
   	 	default:printf("\n Invalid choice");
				
		};
    }while(ch!=4);
	
}

void input()
{
	printf("\n Enter an array");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
	
	}
}
void bubble()
{
	 int j,temp,flag;
   
   for(i=1;i<=n-1;i++)
   {
        flag=0;
      for(j=0;j<n-i;j++)
       {
           if(a[j]>a[j+1])
           {
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
              flag=1;
           }
           
       }
        if(flag==0)
           {
           // printf("break\n");
           break;

           }
           
   }
   	printf("\nAfter bubble sort...\n");
   	output();
	

}
void select()
{int pos;

		for(k=0;k<n-2;k++)
		{
			pos=k;
			i=k+1;
			while(i<=n-1)
			{
				if(a[i] < a[pos])
				  pos=i;
			   i++;	  
			}
			t=a[k];
			a[k]=a[pos];
			a[pos]=t;			
		}
			printf("\nAfter selection sort...\n");
	        output();
  
}
void ins_sort()
{
		
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
		output();
	
}
void output()
{
		for(i=0;i<10;i++)
	{
		printf("%d\t",a[i]);
	
	}
}

