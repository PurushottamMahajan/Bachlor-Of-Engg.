#include<stdio.h>
#include<stdlib.h>
void push();
void pop();
void display();
struct node
{
	int info;
	struct node *next;
}*top;
int main()
{

int ch;
	do
	{
		printf("\n \t\t\t MENU");
		printf("\n1-Insert an element to a stack (PUSH))");
		printf("\n2-Delete an element from a stack(POP))");
		printf("\n3-Display stack after selected operation(DISPLAY)");
		printf("\n4- Exit");
		printf("\n Enter a choice");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:push();break;
			case 2:pop();break;
			case 3:display();break;
			case 0:break;
			default : printf("\n Invalid choice");
		}

	}while(ch!=4);
}
void push()
{
	struct node *n;

	n=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter the element to push");
	scanf("%d",&n->info);
	if(top==NULL)
	{
		n->next=NULL;


	}
	else
	{
		n->next=top;
	}
	top=n;
	printf("\n %d is pushed",n->info);

}
void pop()
{
	struct node *n=top;
	if(top==NULL)
	{
		printf("\n Stack is underflow")
	}
	else
	{
	
	if(top->next==NULL)
	{
	    top=NULL;
	}
	else
	{
    	top=n->next;
	}
	printf("\n %d is poped",n->info);
	free(n);
   }
}
void display()
{
	struct node *n;
	n=top;
	if(top==NULL)
	{
     	printf("\n Stack is empty");
	}
	else
	{
		while(n!=NULL)
		{
			printf("\t\n\n %d",n->info);
	      	n=n->next;
		}
	}

}

