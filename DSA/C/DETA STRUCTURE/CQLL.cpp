#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node *next;
}*front=NULL,*rear=NULL;
void Insert();
void Delete();
void Display();
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
			case 1:Insert();break;
			case 2:Delete();break;
			case 3:Display();break;
			case 0:break;
			default:printf("\n Invlid choice");
		}
	}while(ch!=0);
}
void Insert()
{   struct node *n;

		n=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the element to insert");
	scanf("%d",&n->info);
	if(front==NULL)
	{
		front=n;
		rear=n;  
	}
	else
	{
		rear->next=n;
		rear=n;	
	}
	rear->next=front;	
		printf("\n %d is Inserted",n->info);

}
void Delete()
{
	struct node *n;
	if(front==NULL)
	{
		printf("\n Queue is Underflow");
		
	}
	else
	{
		n=front;
		if(front == rear)
		{
			
			front=rear=NULL;
		}
		else
		{
		
			front=front->next;
		}
		printf("\n %dis deleted ",n->info);
		free(n);
	}
}
void Display()
{
	struct node *n;
	if(front==NULL)
	{
		printf("\n Queue is Empty");
		
	}
	else
	{
		n=front;
		do
		{
			printf("\t%d",n->info);
			n=n->next;
		}while(n!=front);
	}
	
}

