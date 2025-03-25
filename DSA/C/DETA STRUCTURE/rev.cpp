#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
int priority(char);
int isoperator(char);
 char infix[30],pre[30],stk[30];
 int i=0,j=0,top=-1,x;
int main()
{  char exp[30],rev[30];
printf("\nEnter an infix expression");
gets(exp);
strcpy(infix,"(");
strcat(infix,exp);
strcat(infix,")");
strcpy(infix,strrev(infix));
	while(infix[i]!='\0')
	{	if(infix[i]==')')
		{
			top++;
		    stk[top]=infix[i];
		}
	    if(isalpha(infix[i]))
		{
			pre[j]=infix[i];
			j--;
		}
			else if(isoperator(infix[i]))
		{
			while(priority(stk[top]) >= priority(infix[i]))
			{	top++;
				pre[j]=stk[top];
				j--;
			}
			top--;
			stk[top]=infix[i];
        }
        else if(infix[i]=='(')
        {
        	while(stk[top]!=')')
        	{
        		pre[j]=stk[top];
        		j--;
        		top--;
			}
			top--;
		}
		i++;
	}
strcpy(exp,strrev(pre));
printf("\n%s",exp);

}
int isoperator(char ch)
{
	if(ch=='*'||ch=='-'||ch=='+'||ch=='/'||ch=='^'||ch=='%')
	return 1;
	else
	return 0;
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




