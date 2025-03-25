#include<stdio.h>
#include<string.h>
int main()
{
	char name[10][20],temp[20];
	int i,j,x,n=10,flag=0;
	
	printf("\n Enter 10 names");
	for(i=0;i<10;i++)
	{
		gets(name[i]); 
	}
	
     
      for(i=0;i<n-1;i++)
       { 
         for(j=1;j<n;j++)
       {   
	    x=strcmp(name[j-1],name[j]);
	     if(x>0)
           {  
              strcpy(temp,name[j-1]);//t=x
              strcpy(name[j-1],name[j]);//x=y
              strcpy(name[j],temp);  //y=t
           } 
       }
       } 
	printf("\n\n\nSorted Order of Strings\n");
   for(i=0;i<10;i++)
   {
        puts(name[i]);
   }
}
