#include <stdio.h>
#include <string.h>
#include<ctype.h>
#include<stdlib.h>
int priority(char);
int isoperator(char);
int main()
{
	char infix[30],post[30],stk[30];
	int i=0,j=0,top=-1,x;

	printf("\nENTER INFIX EXPRESSION");
	gets(infix);
	top++;
	stk[top]='(';
	strcat(infix,")");
	printf("\n-------------------------------------------------------------");
	printf("\nElement\tStack\t \t \tPostfix");
	printf("\n-------------------------------------------------------------\n");

	while(infix[i]!='\0')
	{
		if(isalpha(infix[i]))
		{
			post[j]=infix[i];
			j++;
		}

		else if(infix[i]=='(')
		{
			top++;
		stk[top]=infix[i];
		}
		else if(isoperator(infix[i]))
		{
			while(priority(stk[top]) >= priority(infix[i]))
			{
				post[j]=stk[top];
				j++;
				top--;
			}
			top++;
			stk[top]=infix[i];
        }
        else if(infix[i]==')')
        {
        	while(stk[top]!='(')
        	{

        		post[j]=stk[top];
        		j++;
        		top--;
			}
			top--;
		}
     printf("\n                 %c                   ",infix[i]);
     for(x=0;x<=top;x++)
     {

         printf("%c",stk[x]);
    }
         printf("                                                                                               ");
       for(x=0;x<j;x++)
         {

             printf("%c",post[x]);
         }

        i++;
    }
    post[j]='\0';
    printf("\n\tPOSTFIX FORM : %s",post);

}
int priority(char ch)
{
   switch(ch)
   {
   	case'^':return 3;
   	case'%':
   	case'*':
	case'/':return 2;
	case'+':
	case'-':return 1;
	default:return 0;

   }


}
int isoperator(char ch)
{
	if(ch=='*'||ch=='-'||ch=='+'||ch=='/'||ch=='^'||ch=='%')
	return 1;
	else
	return 0;
}
