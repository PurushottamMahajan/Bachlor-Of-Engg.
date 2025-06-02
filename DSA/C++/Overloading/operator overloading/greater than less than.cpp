///METHOD 1==> MEMBER FUNCTION
/*
#include<iostream>
using namespace std;
class Sample
{
int x;
    public:
    	Sample()
		{}
        Sample(int a)
        {
	       x=a;
    	}	
    	int operator >(Sample s)///////Greater than operator
    	{
    		if(x>s.x)
    		{
			     return 1;
			}
			else
			return 0;
		}
		int operator <(Sample s)//////Less than operator
    	{
    		if(x<s.x)
    		{
			     return 1;
			}
			else
			return 0;
		}
		int operator ==(Sample s)/////////////Equal to operator
		{
			if(x==s.x)
			{
				return 1;
			}
			else 
			 return 0;
		}
};
int main()
{
	Sample s1(50),s2(144);
	
	if(s1>s2)   //if(s1.operatator >(s2)
	{
		cout<<"\n S1 is greater";
	}
	else 
	{
		cout<<"\n S2 is gretaer";
	}
	
	if(s1<s2)   //if(s1.operatator <(s2)
	{
		cout<<"\n S1 is less";
	}
	else 
	{
		cout<<"\n S2 is less";
	}
	Sample s3(10),s4(10);
	if(s3==s4)                ///if(s3.operatator ==(s4)
	{
		cout<<"\n Equal ";
	}
	else 
	{
		cout<<"\n unequal";
	}
}
*/
//////METHOD 2==>FRIEND FUNCTION

#include<iostream>
using namespace std;
class Sample
{
int x;
    public:
    	Sample()
		{}
        Sample(int a)
        {
	       x=a;
    	}	
    friend	int operator >(Sample , Sample );//////Gretater than operator
    	
    friend	int operator <(Sample , Sample );//////Less than operator
    	
    friend	int operator ==(Sample , Sample );//////Equal to  operator
};

int main()
{
	Sample s1(50),s2(144);
	
	if(s1>s2)   //if(operatator >(s1,s2)
	{
		cout<<"\n S1 is greater";
	}
	else 
	{
		cout<<"\n S2 is gretaer";
	}
	
	if(s1<s2)   //if(s1.operatator (s1,s2)
	{
		cout<<"\n S1 is less";
	}
	else 
	{
		cout<<"\n S2 is less";
	}
	Sample s3(10),s4(10);
	if(s3==s4)                ///if(operatator ==(s3,s4)
	{
		cout<<"\n Equal ";
	}
	else 
	{
		cout<<"\n unequal";
	}
}
int operator >(Sample s,Sample t)
{
	if(s.x>t.x)
	{
	  return 1;
	}
	else 
	  return 0;
}

int operator <(Sample s,Sample t)
{
	if(s.x<t.x)
	{
	  return 1;
	}
	else 
	  return 0;
}

int operator ==(Sample s,Sample t)
{
	if(s.x==t.x)
	{
	  return 1;
	}
	else 
	  return 0;
}
