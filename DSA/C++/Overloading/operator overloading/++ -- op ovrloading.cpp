/*////METHOD 1 ==> MEMBER FUNCTION
#include<iostream>
using namespace std;
class Sample
{
    int x;
    public:
    	
	Sample()
	{
		x=0;
	}
 void operator ++()
	{
		x++;
	}
	void operator --()
	{
		x--;
	}
		void operator ++(int a=0 )
	{
		x++;
	}
	void operator --(int a=0)
	{
		x--;
	}
	void display()
	{
		cout<<"\n X =="<<x;
	}
};
int main()
{
	Sample obj;
	////////////PREFIX OPERATOR OVERLOADING
	++obj;    
	++obj;   //operator ++()
	obj.display();
	--obj;   ////obj.operator--()
	obj.display();   
	//////////////////POSTFIX OPERATOR OVERLOADING
	obj++;
	obj++;
	obj.display();
	obj--;
	obj.display();
}
*/
//////METHOD 2 ==> FRIEND FUNCTION
#include<iostream>
using namespace std;
class Sample
{
    int x;
    
    public:
    	
	Sample()
	{
		x=0;
	}
	void display()
	{
		cout<<"\n X == "<<x;
      
	}
	friend void operator ++(Sample &);
	friend void operator --(Sample &);
};
int main()
{
	Sample obj;
	++obj;             //obj.operator++()
	++obj;           //obj.operator++()
	obj.display();
	--obj;                     //obj.operator--()
     obj.display();
     return 0;
}
void operator ++(Sample &a)
{
	a.x++;
}

void operator --(Sample &a)
{
	a.x--;
}
