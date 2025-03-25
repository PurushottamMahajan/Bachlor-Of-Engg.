
///////////////////STRING REVERSE USING STACK////////////////////////
#include<stdio.h>
int main()
{   int top=0,i=0;
	char str[10];
	char stk[10];
	printf("\n Enter an string ");
	scanf("%s",str);
	top=0;
	while(str[i]!='\0')
	{
	    stk[top]=str[i];
		i++;
		top++;	
	}

	top--;
	while(top!=-1)
	{
		printf("\n %c",stk[top]);
		top--;
	}	
}
