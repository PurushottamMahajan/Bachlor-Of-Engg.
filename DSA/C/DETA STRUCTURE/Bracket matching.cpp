#include<stdio.h>
char str[30],stack[30];
int top = -1;
int main()
{
    int i;
    printf("\nEnter a proper paranthesis");
    gets(str);
    i=0;
    while(str[i] != '\0')
    {
        if(str[i] == '(' || str[i] == '[' || str[i] == '{')
            {
              top++;
              stack[top] =str[i];
            }
        else 
            {
             if(stack[top] == '(' && str[i] == ')'||stack[top] == '{' && str[i] == '}'||stack[top] == '[' && str[i] == ']')
                  top--;

            }
      i++;
    }

    if(top == -1)
        printf("\nPhranthesis are in 'correct' order" );
    else 
     printf("\nPhranthesis are in 'incorrect' order");
}
