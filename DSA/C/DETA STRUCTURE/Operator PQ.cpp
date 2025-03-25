/////////////PRIORITY QUEUE FOR ARITMETIC OPERATORS///////////////
#include<stdio.h>
#include<conio.h>
#define max 5
char a[max];
int front=-1,rear=-1;
void insert();
void delet();
int priority(char ch);
void display();
int main()
{
	int ch;
	do 
	{
		printf("\n MENU");
		printf("\n1-Insert\n2-Delete\n3-Display\n0-Exit");
		printf("\n Enter your choice");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:insert();break;
		    case 2:delet();break;
		   case 3:display();break;
			case 0:break;
			default:printf("\n Invlid choice");
		}
	}while(ch!=0);
}
void insert()
{ 
	char item;
	if(rear==max-1)
	{
		printf("\n Overflow");
		return;
	}
	
	if(front==-1)
	{
		front = rear =0;
	}
	else
	{
		rear++;
		a[rear]=item;
	}
	
	printf("\nEnter the operator to be enqueued:-   ");
    item=getch();
     a[rear] = item;
     printf("\n %c was successfully enqueued in the queue.   ",item); 
     printf("\n%d",rear);
}
int priority(char ch)
{
   switch(ch)
   {
   	case '^':return 3;break;
   	case'%':
   	case'*':
	case'/':return 2;break;
	case'+':
	case'-':return 1;break;
	default:return 0;

   }
  
}
void delet()
{
	int ,pos,ri,item;
		
			
	if(rear==-1)
    {
        front=-1;
        printf("\n underflow");
    }
    else
    {
      pos=0;
       for(i=0;i<=rear;i++)
       {                                                
 
        if(priority(a[pos]) <= priority(a[i]))
           pos=i;
       }
      item=a[pos];
      printf("\n%c is removed",item);
         
      for(i=pos;i<rear;i++) 
      {
       a[i]=a[i+1];
      } 
       rear--;
    }
}
void display()
{
	  int i;
    if(rear==-1)	
    {
		printf("\n Empty stack");
         return;
    }
    
    for( i=0;i!=rear;i=(i+1)%max)
    {
       printf("\t%c",a[i]);
        
     }
    printf("\t%c",a[i]);
  
}


