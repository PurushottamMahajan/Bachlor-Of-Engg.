#include <iostream>
#include<fstream>
using namespace std;
int main()
{
  ofstream fout;
  ifstream fin;
  char ch;
  int c=0;
  fin.open("Sample.txt");
  if(fin!=0)
  {

      while(1)
      {
         ch=fin.get();
        if(ch==' ')
            c++;
         if(fin.eof())
               break;

      }
  }
  else{
    cout<<"\n No such file exists";
  }
return 0;


}
