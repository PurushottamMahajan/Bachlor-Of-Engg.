////////////////PROGRAM FOR PUSH AND POP OPERATION FOR STRINGS//////////////
#include<stdio.h>
#include<string.h>
#define max 5
int top=-1;
char push();
char pop();
void display();
char str[20];
char stk[max][20];
int main()
{ int ch;
	do
	{
		printf("\n \t\t\t MENU");
		printf("\n1-Insert an element to a stack");
		printf("\n2-delete an element from stack");
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
			default :printf("\n Invalid choice");
		}

	}while(ch!=4);
}


char push()
{
	if(top == max-1)
	{
		printf("\n Stack is Overflow Now");
		return 0;
		
	}
    printf("\n Enter an element to push on to the stack");
    scanf("%s",str);
    top++;
    strcpy(stk[top],str);

    
}

char pop()
{
	if(top == -1)
	{
		printf("\n Stack is Underflow Now");
		return 0;
	}
    strcpy(str,stk[top]);
	top--;
	printf("\n %s is pop out from stack",str);	
    
}
void display()
{
  int i;
  for(i=top;i>=0;i--)
  {
  	printf("\n %s\n",stk[i]);
  }
}
