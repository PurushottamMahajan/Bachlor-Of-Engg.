/////METHOD 1-->PARAMETERIZED CONSTRUCTOR
/*
#include<iostream>
using namespace std;
class Length
{
	int ft ,in;
	public:
		Length(){}
		Length(int a)
		{
			ft=a/12;
			in=a%12;
			
		}
		void display()
		{
			cout<<"\n "<<ft<<":"<<in;
		}
};
int main()
{
	Length t;
	int x=140;
	t=x;
	t.display();
}
*/
/////METHOD 2-->ASSIGNMENT OPERATOR OVERLOADING
#include<iostream>
using namespace std;
class Length
{
	int ft,in;
	public:
		Length()
		{}
		void display()
		{
			cout<<"\n "<<ft<<":"<<in;
		}
		operator =(int a)
		{
		   	ft=a/12;
			in=a%12;
			
		}
	};

int main()
{
	Length t;
	int x=147;
	t=x;
	t.display();
}
	
