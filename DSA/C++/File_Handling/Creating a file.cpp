#include<iostream>
#include<fstream>
using namespace std;
int main()
{
   char name[30],clg[30],ch;
    ofstream fout("Sample.txt",ios::app);
       do{
         cout<<"\n Enter Name  ";
          cin>>name ;
          cout<<"\n Enter collage";
          cin>>clg;
          cout<<"\n Do u want add more";
          cin>>ch;
          fout<<name<<"\t"<<clg<<"\n";
       }while(ch!='n');


    cout<<"\n records are saved";
    fout.close();
    fstream fi

}
