////////Travers Insert Delete ///////////
#include<stdio.h>
int i,n=5;
int a[10];
int tra();
int insert();
int del_ete();
int main()
{   int ch;
        printf("\n Enter an array elements");
    for(i=0;i<n;i++)
    { scanf("%d",&a[i]);
      
     }
     
   do{  printf("\n\t\tMENU");
   	 printf("\n 1-TRAVERSE \n 2-INSERT \n 3-DELETE \n 4-EXIT");
   	 scanf("%d",&ch);
   	 switch(ch)
   	   {
   	 	case 1:tra();break;
   	 	case 2:insert();break;
   	 	case 3:del_ete();break;
   	 	case 4:break;
   	 	default:printf("\n Invalid choice");		
		};
    }while(ch!=4);  
}
int tra()
{   printf("\n Elements of array....\n");
	 i=0;
	while(i<n)
	{     printf("\t%d",a[i]);
		i++;
	}
}
int insert()
{	int item,pos;
	printf("\n Enter a position to insert an elelment...");
	scanf("%d",&pos);	
	if(pos>=0 && pos<= n )
	{     printf("\n Enter a element to insert at position...");
	      scanf("%d",&item);
    	i=n-1;
    	while(i>=pos)
    	{   a[i+1]=a[i];
	    	i--;
	    }
	    n++;
	    a[pos]=item;
	    printf("\n %d is inserted at %d  position",item,pos);
	    printf("\n Number of elements in array after insertion=%d",n);
   }
   else
   printf("\n Invalid position");
}
int del_ete()
{   int pos;
    int item;
		printf("\n Enter a position to delete an elelment...");
	    scanf("%d",&pos);
	    item=a[pos];
	   
	if(pos>0 && pos< n )
      {     i=pos;
	    	while(i<=n-1)
	    {
	    	a[i]=a[i+1];
	    	i++;
     	}
     	n--;
     	printf("\n %d is deleted from array from %d position",item,pos);
	
		printf("\n Number of elements in array after deletion=%d",n);
     }
    else
       printf("\n Invalid choice");
}

