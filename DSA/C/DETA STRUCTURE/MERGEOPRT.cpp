#include<stdio.h>
int main()
{
    int a[5]={20,40,60,80,90},b[5]={10,30,50,70,100},c[10];
    int i,j,k,n=5;

    i=0;
    j=0;
    k=0;

    while(k<10)
    {
        if(a[i]<b[j])
        {
            c[k]=a[i];
            i++;
           
        }
        else
        {
            c[i]=b[j];
            j++;
             
        }
        k++;
    }


    printf("\nSorted List Is:-");
    for(k=0;k<10;k++)
    {
        printf("\n%d",c[k]);
    }

    return 0;


}
