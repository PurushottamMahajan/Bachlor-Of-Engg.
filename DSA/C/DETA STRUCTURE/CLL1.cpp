#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node *next;
    struct node *prev;
}*first=NULL,*last=NULL;
void Insert();
//void Delete();
void Display();
void Search();
int length();
int main()
{int ch;

    do
    {
        printf("\n!!!MENU!!!");
        printf("\n1.INSERT");
        printf("\n2.DELETE");

        printf("\n3.DISPLAY");
        printf("\n0.EXIT");

        printf("\nEnter the choice:-");
        scanf("%d",&ch);

        switch(ch)
        {
            case   1:Insert();break;
          //  case   2:Delete();break;

            case   3:Display();break;
            case   0:break;
            default:printf("\nINVALID CHOICE");
        }

    }while(ch!=0);
    printf("\nTHANK YOU");

    return 0;
}
int length()
{
    int c;
    struct node *p;
	if(first==NULL)
	{
		c=0;
		return(c);

	}
	else
	{

    p=first;
   while(p!=NULL)
    {
        c++;
        p=p->next;
    }
    return(c);
   }
}
void Insert()
{
	struct node *p,*n,*t;
    int pos,i;

    printf("\nEnter the position:-");
    scanf("%d",&pos);

    if(pos<=(length()+1) && pos>=1)
    {
    	n=(struct node*)malloc(sizeof(struct node ));
		printf("\n Enter the number");
		scanf("%d",&n->info);

    	if(first == NULL && last == NULL)//FOR EMPTY LIST
    	{
    		n->prev=NULL;
    		n->next=NULL;
    		first=n;
			last=n;
		}
		else if(pos == 1)//FORNON EMPTY BUT A SINGLE ELEMENT LIST
		{
		    n->prev=NULL;
			n->next=first;
			first->prev=n->next;
			first = n;
		}
		else//FOR MIDDLE INSERTION
		{
		    p=first;
            for(i=1;i<pos-1;i++)
            {
                p=p->next;
            }
		     t=p->next;//t=null
			 n->next=p->next;//new node chya next la list cha next element assign zala
			 n->prev=p; //new node chya prev la new node cha previous element bhetla
			 p->next=n;//previous node chya next la new element
			 t->prev=n;	//new node chya next element chy prev la new node bhetla
		}
	printf("\n%d is inserted at %d pos",n->info,pos);

	}
     else
     {
     	printf("\n Invalid position");
	 }
}
void Display()
{
struct node *p;
	if(first==NULL)
	{
		printf("\n List is empty");

	}
	else
	{
		printf("\n List is ...");
		p=first;
		while(p!=NULL)
		{
			printf("%d \t",p->info);
			p=p->next;

		}
	}
}
