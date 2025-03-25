#include<iostream>
#include<stdlib.h>
using namespace std;
class linklist;
 Node
{
	 int info;
     Node *next;
    friend class linklist;
};
class linklist
{
	private:
		Node *start;
	public:
	
void display()
{
   Node *p;
    if(start==NULL)
    {
        cout<<"\nUNDERFLOW";
    }
    else
    {
        p=start;
        cout<<"\nList Is:-";
        while(p!=NULL)
        {
            cout<<p->info;
            p=p->next;
        }
    }
}
void search()
{
    Node *p;
    int item;

    if(start==NULL)
    {
        cout<<"\nUNDERFLOW";
    }
    else
    {
       cout<<"\nEnter the number to search:-";
        cin>>item;

        p=start;
        while(p!=NULL)
        {
            if(p->info==item)
            {
			   cout<<"\n"<<item<<"is found in list";
               break;
           }
            p=p->next;
            
        }
        if(p==NULL)
        {
            cout<<"\n"<<item<<"is not found in list";
              
        }
    }
}
int length()
{
    int c=0;
     Node *p;
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
   
    int pos,i;
     Node *p,*n;
   cout<<"\nEnter the position:-";
    cin>>pos;

    if(pos<=(length()+1) && pos>=1)
    {
        n=( Node*)malloc(sizeof( Node));

        cout<<"\nEnter Info:-";
        cin>>n->info;

        if(pos==1)
        {
            n->next=start;
            start=n;
             cout<<"\n"<<n->info<< "is inserted at "<<pos <<"pos";
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
           cout<<"\n"<<n->info<< "is inserted at "<<pos <<"pos";
        }
    }
        else
            cout<<"\nINVALID POS";
}
	
void Delete()
{
    Node *p,*n;
    int pos=0,i;

    if(start==NULL)
    {
       cout<<"\nUNDERFLOW";
    }
    else
    {
        cout<<"\nEnter the pos:-";
        cin>>pos;

        if(pos<=length() && pos >=1)
        {
            if(pos==1)
            {
                n=start;
                start=n->next;
             cout<<"\n"<<n->info<< "is deleted from "<<pos <<"pos";
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

                cout<<"\n"<<n->info<< "is deleted from "<<pos <<"pos";
				 free(n);
            }
        }
        else
            printf("\nINVALID POS");
    }
}


};
int main()
{
	 int ch;
	 linklist l;

    do
	{
        cout<<"\n1-Insert";
           cout<<"\n2-Delete";
            cout<<"\n3-Search";
             cout<<"\n4-Display";
             cout<<"\n Enter choice";
             cin>>ch;
        switch(ch)
        {
            case   1:l.insert();break;
            case   2:l.Delete();break;
            case   3:l.search();break;
            case   4:l.display();break;
            case   5:break;
            default:printf("\nINVALID CHOICE");
        }

    }while(ch!=5);
    printf("\nTHANK YOU");

    return 0;
}

