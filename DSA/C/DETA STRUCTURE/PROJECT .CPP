#include <iostream>
#include <string.h>
#include<ctype.h>
#include<stdlib.h>
int STACK[20],TOP=-1;         //DECLARING STACK FOR COLLECTING VALUESOF OPERANDS
int push(int);
int pop();
int main()
{

    char exp[30];
    char *temp;          // ARRAY (STRING FOR COLLECTING USER INPUT POSTFIX EXPRESSION
    int op1,op2,op3,num,i=0;  // SOME REQUIRED VARIABLES

     printf("\n Enter a Postfix Expression without space.........");
      scanf("%s",exp);// USER INPUT
     temp=exp;

     while(exp[i] != '\0' )
     {

         if(isdigit(exp[i]))     // CONVERTIG A CHAR INTO A INTEGER NUMBER
         {
             num=*temp-48;
             push(num);
         }
         else
         {

             op1=pop();
             op2=pop();
    switch(*temp)
   {

   	case '*':op3=op1*op2;break;
	case '/':op3=op1/op2;break;
	case '+':op3=op1+op2;break;
	case '-':op3=op1-op2;break;

   }

           push(op3);     // COPY RESULT OF 2 OPERANDS ON TO THE TOP OF STACK FOR NEXT OPERSTION
         }
         temp++;
         i++;
     }


     printf("\n The result of %s = %d   ",exp,pop());   // USER SCREEN OUTPUT
}

int push(int x)       // PUSH OPERAND ON TO THE STACK
   {
       STACK[++TOP]=x;
   }
   int pop()
   {
     return (STACK[TOP--]);

   }
