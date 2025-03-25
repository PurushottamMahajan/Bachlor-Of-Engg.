///OVERLOADING TYPE CASTE OPERATOR
#include<iostream>
using namespace std;

class Test
{
	int y;
	public:
		Test()
		{}
		void display()
		{
			cout<<"\n y=="<<y;
		}
		friend class Sample;
};

class Sample
{
	int x;
	public:
		Sample()
		{
		}
		Sample(int a)
		{x=a;}
		operator Test()
		{
		   Test t;
		   	t.y=x;
		   	return t;
		}
		void display()
		{
			cout<<"\n x=="<<x;
		}
		
};
int main()
{
	Sample s(111);
	Test t;
	t=s;
	s.display();
	t.display();
}
