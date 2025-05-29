///////ARRAY AND FUNCTIONS
#include<iostream>
using namespace std;
class Array
{   
    private:
	int a[20],n;
	
	public:
		Array()
		{
		
			n=0;
		}
		void insert()      //INSERT
		{
			int i,pos,item;
			cout<<"\n Enter a position";
			cin>>pos;
			if(pos>=n+1)
			{
				cout<<"\n Invalid position";
				return;
			}
			cout<<"\n Enter element to insert";
			cin>>item;
			n++;
			for(i=n-1;i>=pos;i--)
			{
				a[i+1]=a[i];
			}
			a[pos]=item;
			cout<<item<<" is inserted";
	
			
		}
		void delet()      //DELETE
		{
			int item,i,pos;
			
			cout<<"\n Enter pos to delete an element ";
			cin>>pos;
			if(pos>=n+1||pos==n)
			{
				cout<<"\n Invalid position";
				return;
			}
			cout<<"\n "<<a[pos]<<" is deleted";
			for(i=pos;i<=n;i++)
			{
				a[i]=a[i+1];
			}
			n--;
		}
		void lsearch()      //LINEAR SEARCH
		{
			int i,item,flag;
			
			cout<<"\n Enter Number To Be Searched ";
			cin>>item;
			
			for(i=0;i<n;i++)
			{
				if(a[i]==item)
				{
					cout<<"\n "<<item<<" is found at "<<i<<"position";
					flag=1;
				}
			}
				if(flag==0)
				{
					cout<<item<<" is not found";
				}
		}
		
		void traverse()
		{
			int i;
			for(i=0;i<n;i++)
			{
				cout<<"\t"<<a[i];
			}
		}
};
int main()
{
	Array a;
	int ch;
	
	do{
          cout<<"\n \t\t MENU \n 1-Isert \n 2-Delete \n3-Linear search  \n 4-Traverse \n 0-Exit ";
	       cout<<"\n Enter your choice";
	       cin>>ch;
	       switch(ch)
	       {
	       	case 1:a.insert();break;
	       	case 2:a.delet();break;
	       	case 3:a.lsearch();break;
	       	case 4:a.traverse();break;
	       	case 0:break;
	       	default:cout<<"\n Enter a valid choice";
	       	
		   }
        }while(ch!=0);	   
}

