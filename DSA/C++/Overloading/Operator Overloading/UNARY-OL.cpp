////METHOD 1 ==> MEMBER FUNCTION
/*
#include<iostream>
using namespace std;
class Sample
{
    int x,y,z;
    public:
    	Sample()
		{}
	Sample(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	Sample operator -()
	{
		Sample s;
		s.x=-x;
		s.y=-y;
		s.z=-z;
		return s;
	}
	void display()
	{
		cout<<"\n X =="<<x;
		cout<<"\n Y =="<<y;
		cout<<"\n Z =="<<z;
	}
};
int main()
{
	Sample s1(10,-20,30),s2;

	s1.display() ;
		s2 =-s1;
	s2.display();
	return 0;
}

*/
/////METHOD 2==>FRIEND FUNCTION
#include<iostream>
using namespace std;
class Sample
{
    int x,y,z;
    public:
    	Sample( ){}   	
	Sample(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	void display()
	{
		cout<<"\n X =="<<x;
		cout<<"\n X =="<<y;
		cout<<"\n X =="<<z;
	}
	
	friend Sample operator - (Sample&);
};


int main()
{
	Sample s1(10,-20,30),s2;

	s1.display() ;
	s2 = -s1;
	s2.display();
	return 0;
}
Sample operator -(Sample  &a)
	{
		Sample s;
		s.x=-a.x;
		s.y=-a.y;
		s.z=-a.z;
		return s;
	}
	
