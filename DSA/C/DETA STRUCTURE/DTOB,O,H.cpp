#include <stdio.h>
int str[10];
int dtob();
int dtoo();
int dtoh();
void display();
int n,top=-1,i;
int main()
{ int ch;
  do{
  	printf("\n \t\tMENU");
  	printf("\n1-DECIMAL TO BINARY  ");
  	printf("\n2-DECIMAL TO OCTAL  ");
	  printf("\n3-DECIMAL TO HEXADECIMAL  ");
	  printf("\n4-EXIT");
	  printf("\n Enter the choice");
	  scanf("%d",&ch);
	  switch(ch)
	  {
	  	case 1:dtob();break;
	  	case 2:dtoo();break;
	  	case 3:dtoh();break;
	  	case 4:break;
	  	default:printf("\n INvalid choice");
	  }
  	
  }while(ch!=4);
 
}
int dtob()
{top=-1;
	  
    printf("enter the number");
    scanf("%d",&n);
    
    while(n!=0)
    {
        top++;
        str[top]=n%2;
        n=n/2;
        
    }
     printf("\n Binary quivalence of given number is= ");
  display();
}
int dtoo()
{
	top=-1;	  
    printf("enter the number");
    scanf("%d",&n);
    while(n!=0)
    {
        top++;
        str[top]=n%8;
        n=n/8;
    }
     printf("\n octal quivalence of given number is= ");
     display();
}
int dtoh()
{     top=-1;   
printf("enter the number");
    scanf("%d",&n);
    
    while(n!=0)
    {
        top++;
        str[top]=n%16;
        n=n/16;
        
    }
     printf("\n Hexa decimal quivalence of given number is= ");
     for(i=top;i>=0;i--)
	 {
	    switch(str[i])
	    {
	    	case 10:printf("A");break;
	    	case 11:printf("B");break;
			case 12:printf("C");break;
			case 13:printf("D");break;
			case 14:printf("E");break;
			case 15:printf("F");break;
			default:printf("%d",str[i]);break;
		}
}
}
void display()
{
	 
  for(i=top;i>=0;i--)
  {
  printf("%d",str[i]);
  }
}
