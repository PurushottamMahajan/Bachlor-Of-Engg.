////METHOD 1 ==> MEMBER FUNCTION
/*
#include<iostream>
using namespace std;
class Sample
{
    int x,y;
    public:
    	Sample()
		{}
		Sample(int a,int b)
	{
		x=a;
		y=b;
	}
	Sample operator +(Sample a)
	{
	   Sample s;
	   s.x=x+a.x;
	   s.y=y+a.y;
	   return s;
     }
     
     
	void display()
	{
		cout<<"\n X =="<<x;
		cout<<"\n Y =="<<y;

	}
};
int main()
{
	Sample s1(10,20),s2(12,23),s3;
	s3=s1+s2;
	s1.display();
	s2.display();
	s3.display();
}
*/



#include<iostream>
using namespace std;
class Sample
{
    int x,y;
    public:
    	Sample()
		{}
		Sample(int a,int b)
	{
		x=a;
		y=b;
	}
	friend Sample operator +(Sample a,Sample b);
	void display()
	{
		cout<<"\n X =="<<x;
		cout<<"\n Y =="<<y;

	}
};
int main()
{
	Sample s1(10,20),s2(12,23),s3;
	s3=s1+s2;
	cout<<"\n 1st Operand:";
	s1.display();
		cout<<"\n 2nd Operand:";
	s2.display();
		cout<<"\nAddition:";
	s3.display();
}
Sample operator +(Sample a,Sample b)
	{
	   Sample s;
	   s.x=a.x+b.x;
	   s.y=a.y+b.y;
	   return s;
     }
