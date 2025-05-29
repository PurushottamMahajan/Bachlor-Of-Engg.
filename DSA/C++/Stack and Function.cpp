/////STACK AND FUNCTION
#include<iostream>
#define max 10
using namespace std;
class Stack
{
	int stk[max],top;
	public:
		Stack()
		{
			top=-1;
		}
		void push()
		{
		  int item;
			if(top==max-1)
			{
				cout<<"\n Stack is overflow";
			}
			else
			{
				cout<<"\n Enter an item to push";
				cin>>item;
				stk[++top]=item;
				cout<<"\n "<<item<<"  is pushed on to the stack";
			}
		}
		void pop()
		{
		  int item;
		  if(top==-1)
		  {
		  	cout<<"\n Stack is underflow";
		  }
		  else
		  {
		  	item=stk[top--];
		  	 cout<<"\n "<<item<<"is poped from stack";
		  }	
		}
		void search()
		{
			int item,i,flag=0;
	      	cout<<"\n Enter an item to search";
		    cin>>item;
		    for(i=top;i>-1;i--)
		    {
		    		if(stk[i]==item)
	            	{
		             	cout<<"\n"<<item<< "is found at "<<i<<"position";
		            	flag=1;		
		            }	
	        }
	        if(flag==0)
     	   {
		    	cout<<"\n"<<item<< "is not found ";
			
           	}
		}
		void display()
		{
			int i;
			if(top==-1)
			{
				cout<<"\n Stack is empty";
				
			}
			
			else
			{
			     cout<<"\n Stack is..........\n";
			     cout<<"\n Top-->";
		     	for(i=top;i>-1;i--)
		     	{
		    		cout<<"\t\t\t"<<stk[i]<<"\n"; 
		     	}
		    }
		
		}
		
};
int main()
{    
     Stack s;
	int ch;
	do
	{
		cout<<"\n \t\t\t MENU";
		cout<<"\n1-Insert an element to a stack";
		cout<<"\n2-Delete an element from a stack";
		cout<<"\n3-Search an element in stack";
		cout<<"\n4-Display stack after selected operation";
		cout<<"\n0- Exit";
		cout<<"\n Enter a choice";
		cin>>ch;
		switch(ch)
		{
			case 1:s.push();break;
			case 2:s.pop();break;
		    case 3:s.search();break;
			case 4:s.display();break;
			case 0:break;
			default :cout<<"\n Invslid choice";
		}

	}while(ch!=0);
}

