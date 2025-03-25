#include<stdio.h>
#define max 5
int stack[max],top=-1,item;
int push();
int pop();
int display();
int main()
{ int ch;
	do
	{
		printf("\n \t\t\t MENU");
		printf("\n1-Insert an element to a stack");
		printf("\n2-Delete an element from a stack");
		printf("\n3-Display stack after selected operation");
		printf("\n4- Exit");
		printf("\n Enter a choice");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:push();break;
			case 2:pop();break;
			case 3:display();break;
			case 4:break;
			default : printf("\n Invalid choice");
		}

	}while(ch!=4);
}
int push()
{
	if(top == max-1)
	{
		printf("\n Stack is Overflow Now");
		return 0;	
	}
    printf("\n Enter an element to push on to the stack");
	scanf("%d",&item);
	top++;
	stack[top]=item;	
    
}


































int pop()
{
	if(top == -1)
	{
		printf("\n Stack is Underflow Now");
		return 0;
	}

	item=stack[top];
	top--;
	printf("\n %d is pop out from stack",item);	  
}
int display()
{
  int i;
  for(i=0;i<=top;i++)
  {
  	printf("\t %d",stack[i]);
  }
}










