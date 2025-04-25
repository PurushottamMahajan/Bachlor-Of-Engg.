////////////QUEUE AND FIUNCTIONS
#include<iostream>
#define max 10
using namespace std;
class Queue
{
	int q[max],item,front,rear;
	
	public:
	 Queue()
	 {
	
	   front=-1;
	   rear=-1;
	    	
	 }
	 void enque()
	 {
	 	if((front==0 && rear == max -1) || rear+1 == front)//simple queue:-if(rear==max-1)
	 	{
	 		cout<<"\n Queue is Overflow";
	 		return;
		 }
		 if(front==-1 && rear == -1)
		 {
		 	front=0;
		 	rear=0;
		 }
		 else if(rear==max-1)
		 {
		 	rear=0;
		 }
		 else
		 {
		 	rear++;
		 }
		 cout<<"\n Enter Element to insert";
		 cin>>item;
		 q[rear]=item;
		 cout<<"\n "<<item<<" is inserted";
	
	 }	
	 void dequeue()
	 {
	 	if(front==-1)
	 	{
	 		cout<<"\n Queue is UNderflow";
             return;
		 }
		 item=q[front];
		 if(front ==rear)
		 {
		 	front=-1;
		 	rear=-1;	
		 }
		 else if(front==max-1)
		 {
		 	front=0;
		 }
		 else
		 {
		 	front++;
		 }
		 	cout<<"\n "<<item<<" is deleted";
		   
	}
	void search()
	{
		int item,i,flag=0;
		cout<<"\n Enter an item to search";
		cin>>item;
		for(i=front;i<=rear;i++)
		{
				if(q[i]==item)
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
	{ int i;
		for(i=front;i!=rear;i=(i+1)%max)
		{
			cout<<"\t"<<q[i];
		}
      	cout<<"\t"<<q[i];
	}

};
int main()
{   
    Queue q;
   int ch;
	do 
	{
		printf("\n MENU");
		printf("\n1-Insert\n2-Delete\n3-Search\n4-Display\n0-Exit");
		printf("\n Enter your choice");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:q.enque();break;
			case 2:q.dequeue();break;
			case 3:q.search();break;
			case 4:q.display();break;
			case 0:break;
			default:printf("\n Invlid choice");
		}
	}while(ch!=0);
}
	

