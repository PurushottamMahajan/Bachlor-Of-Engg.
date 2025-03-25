///OVERLOADING TYPE CASTE OPERATOR
#include<iostream>
using namespace std;
class Length
{
	int ft ,in;
	public:
		Length(){}
		Length(int a,int b)
		{
			ft=a;
			in=b;
			
		}
		operator int()
		{
			int x;
			x=ft*12+in;
			return x;
		}
};
int main()
{
	Length t(12,3);
	int x;
	x=t;
	cout<<"\n X=="<<x;
}
