////////////INSERTION AND DELETION AS PER GIVEN INPUT NUMBER AND ONE NUMBER AFTER INPUT NUMBER //////
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node *next;
}*start=NULL;
void insert();
void Delete();
void display();
int main()
{
    int ch;

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
            case   1:insert();break;
            case   2:Delete();break;
            case   3:display();break;
            case   0:break;
            default:printf("\nINVALID CHOICE");
        }

    }while(ch!=0);
    printf("\nTHANK YOU");

    return 0;
}
void insert()
{
	struct node *p,*n;
	int temp;
	p=start;
	
	    n=(struct node*)malloc(sizeof(struct node));      
      if(p==NULL)
	 {
	 	printf("\nEnter the element:-");
        scanf("%d",&n->info);
	       n->next=start;
            start=n;
             printf("\n%d is inserted at",n->info);
	 }
	 else{
	 	printf("\nEnter the element:-");
    scanf("%d",&n->info);
    
	printf("\nEnter the element after u want to insert:-");
    scanf("%d",&temp);
     
            while(p!=NULL)
            {
             	if(p->info==temp)
         	{
     		    n->next=p->next;
     		    p->next=n;
     	    	printf("\n %d is inserted ",n->info);
     	    	break;
		    }
		        else
		        {
		 	    p=p->next;
		        }
	        }
	        if(p==NULL)
	        {
	        	printf("\n Invalid choice");
			}
          }
	
}/*
void Delete()// ELEMENT WISE DELETION
{
	struct node *p,*n,*q;
    int temp;


	if(start==NULL)
	    printf("\n underflow");
    else
	{
        printf("\nEnter the element u want to delete:-");
        scanf("%d",&temp);
        n=start;
        while(n!=NULL && n->info!=temp)
        {
            p=n;
            n=n->next;
        }
        if(n==NULL)
            printf("\n%d is not found ", temp);
        else
        {
            if(n==start)
                start=start->next;
            else
                p->next=n->next;

            printf("\n %d is deleted",n->info);
            free(n);
        }
    }
}
*/

void Delete()//DELITION AS PER INPUT NUMBER'S NEXT ELEMENT
{struct node *p,*n,*q;
	   int temp;
    if(start==NULL)
        printf("\nUnderflow");
    else
    {
       	printf("\nEnter the element after u want to delete:-");
         scanf("%d",&temp);

	        p=start;
            while(p!=NULL && p->info!=temp)
            p=p->next;

            if(p==NULL)
                printf("\n %d Item not found",temp);
            else if(p->next!=NULL)
            {
                n=p->next;
                if(p->next==NULL)
                    printf("\nThere is no node after %d",p->info);
                else
                {
                    p->next=n->next;
                    printf("\n %d is deleted",n->info);
                    free(n);
                }
			}
			else
			{
				n=start;
                start=n->next;
                 printf("\n%d was last one element in list that was deleted from list",n->info);
                free(n);
			}
    }

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
      
        printf("\nList Is:-");
          p=start;
        while(p!=NULL)
        {
            printf("%d\t",p->info);
            p=p->next;
        }
    }
}


