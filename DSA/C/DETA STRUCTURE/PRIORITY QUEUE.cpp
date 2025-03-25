//////////PRIORITY QUEUE//////
#include<stdio.h>
#define max 5
int a[max],front=-1,rear=-1,pos=0;
void insert();
void delet();
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
	int item;
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
	
	printf("\nEnter the number to be enqueued:-   ");
    scanf("%d",&item);
     a[rear] = item;
     printf("\n %d was successfully enqueued in the queue.   ",item);///20 10 40 55 60 
}
void delet()
{
	int i,item;	
		if(rear==-1)
       {
        front=-1;
        printf("\n underflow");
        }

  else
   {
    pos=0;
 
    for(i=0;i<=rear;i++)//find maximum element
    {
      if(a[pos]<= a[i])
      {
         pos=i;
      }
     
    }
      item=a[pos];
        printf("\n%d are remove from position %d",item,pos);
    for(i=pos;i<=rear;i++) //delete maximum element
    {
       a[i]=a[i+1];
       rear--;
    } 
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
       printf("\t%d",a[i]);
        
     }
    printf("\t%d",a[i]);
}


