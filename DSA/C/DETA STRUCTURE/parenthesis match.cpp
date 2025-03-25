// Online C compiler to run C program online
#include<stdio.h>
int main()
{
  char str[15],stk[15];
  int i=0,top=-1;
  printf("\nEnter an expression");
  gets(str);
  
  while(str[i]!='\0')
  { 
  	if(str[i]=='(' || str[i]=='[' || str[i]=='{')
  	{     
  		stk[top]=str[i];
  		top++;
  		
	}
	if(str[i]==')' || str[i]==']' || str[i]=='}')
  	{
  		stk[top]=str[i];
  		top--;
  		
	}
	i++;
  }
  if(top==-1)
  {
  	printf("\n Given expression %s is valid",str);	
  }
  else
  {
  printf("\n Given expression %s is invalid",str);
  }
}


