/////METHOD 1-->PARAMETERIZED CONSTRUCTOR
/*
#include<iostream>
using namespace std;
class Sample
{
	int x;
	public:
		Sample(int a)
		{
			x=a;
			
		}
	void display()
	{
		cout<<"\n X=="<<x;
	}
	friend class Test;
};
class Test
{
   int y;
   public:
   	Test()
   	{}
   	Test(Sample a)
   	{
   		y=a.x;
	}
   	  
  	void display()
	{
		cout<<"\n Y=="<<y;
	}
};
int main()
{
	Sample s(23);
	Test t;
	t
	=s;
	s.display();
	t.display();
}
*/
/////METHOD 2-->ASSIGNMENT OPERATOR OVERLOADING
#include<iostream>
using namespace std;
class Sample
{
	int x;
	public:
		Sample(int a)
		{
		  x=a;
		}
	void display()
	{
		cout<<"\n X=="<<x;
	}
	friend class Test;
};

class Test
{
   int y;
   public:
   	Test()
   	{}
     operator =(Sample a)
   	{
   		y=a.x;
	}
   	  
  	void display()
	{
		cout<<"\n Y=="<<y;
	}
};

int main()
{
	Sample s(23);
	Test t;
	t
	=s;
	s.display();
	t.display();
}
