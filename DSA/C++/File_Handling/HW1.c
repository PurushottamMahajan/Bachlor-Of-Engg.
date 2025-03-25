#include<iostream>
#include<fstream>
using namespace std;
int main()
{
   char src1[30],src2[30],dest[30],ch;
   ofstream fout;
   ifstream fin;

   cout<<"\n Enter Source file 1 ";
   cin>>src1;
   fin.open(src1);
   if(!fin)
   {
      cout<<"\n Enter Source file 2";
      cin>>src2;
      cout<<"\n Enter Destination file";
      cin>>dest;


      while(1)
      {
          fout.open(dest,ios::app);
           ch=fin.get();
         fout<<ch;

         if(eof())
         {
            fin.open(src1);
             ch=fin.get();
             fout<<ch;
             if(eof())
               break;

         }


      }

   }
 }
