#include<stdio.h>
#include<malloc.h>
struct emp
{
	int id;
	char name[30];
	float salary;
};
int main()
{   int a;
      struct emp *ptr;
     
    ptr=(struct emp *)malloc(a*sizeof(struct emp));
     printf("\n Enter id");
     scanf("%d",ptr->id);
     printf("\n Entr name");
     scanf("%s",ptr->name);
     printf("\n Enter salary");
     scanf("%f",ptr->salary);
     
     
     
     printf("\n ID\tName\tSalary");
     printf("%d\t%s\t%f",emp.id,emp.name,emp.salary);
}
