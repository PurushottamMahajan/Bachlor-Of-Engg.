//POSITION WISE INSERTION AND DELETION
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node *next;
}*start=NULL;
void insert();
void Delete();
void search();
void display();
int length();
int main()
{
    int ch;

    do
    {
        printf("\n!!!MENU!!!");
        printf("\n1.INSERT");
        printf("\n2.DELETE");
        printf("\n3.SEARCH");
        printf("\n4.DISPLAY");
        printf("\n5.EXIT");

        printf("\nEnter the choice:-");
        scanf("%d",&ch);

        switch(ch)
        {
            case   1:insert();break;
            case   2:Delete();break;
            case   3:search();break;
            case   4:display();break;
            case   5:break;
            default:printf("\nINVALID CHOICE");
        }

    }while(ch!=5);
    printf("\nTHANK YOU");

    return 0;
}

void display()
{
    struct node *p;

    if(start==NULL)
    {
        printf("\nUNDERFLOW");
    }
    else
    {
        p=start;
        printf("\nList Is:-");
      do{
      	printf("%d\t",p->info);
            p=p->next;
	  }while(p!=start);
    }
}
void search()
{
    struct node *p;
    int item;

    if(start==NULL)
    {
        printf("\nUNDERFLOW");
    }
    else
    {
        printf("\nEnter the number to search:-");
        scanf("%d",&item);

        p=start;
        while(p!=NULL)
        {
            if(p->info==item)
            printf("\n%d is found in list",item);
            p=p->next;
        }
        if(p==NULL)
        {
            printf("\n%d is not found in the list ",item);
        }
    }
}
int length()
{
    int c=0;
    struct node *p;
c=0;
    p=start;
    while(p!=NULL)
    {
        c++;
        p=p->next;
    }
    return(c);
}
void insert()
{
    struct node *p,*n;
    int pos,i;

    printf("\nEnter the position:-");
    scanf("%d",&pos);

    if(pos<=(length()+1) && pos>=1)
    {
        n=(struct node*)malloc(sizeof(struct node));

        printf("\nEnter Info:-");
        scanf("%d",&n->info);

        if(pos==1)
        {
             n->next=start;
             start=n;
             
             printf("\n%d is inserted at %d pos",n->info,pos);
        }
        else
        {
            p=start;
            for(i=1;i<pos-1;i++)
            {
                p=p->next;
            }
            n->next=p->next;
            p->next=n;
            printf("\n%d is inserted at %d pos",n->info,pos);
        }
    }
        else
            printf("\nINVALID POS");
}
void Delete()
{
    struct node*p,*n;
    int pos=0,i;

    if(start==NULL)
    {
        printf("\nUNDERFLOW");
    }
    else
    {
        printf("\nEnter the pos:-");
        scanf("%d",&pos);

        if(pos<=length() && pos >=1)
        {
            if(pos==1)
            {
                n=start;
                start=n->next;
                printf("\n%d is deleted from list at %d pos",n->info,pos);
                free(n);
            }
            else
            {
                p=start;

                for(i=1;i<pos-1;i++)
                {
                    p=p->next;
                }
                n=p->next;
                p->next=n->next;

                printf("\n%d is deleted from %d pos",n->info,pos);
                free(n);
            }
        }
        else
            printf("\nINVALID POS");
    }
}

