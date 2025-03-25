#include<stdio.h>
#include<stdlib.h>
struct node{
     int info;
     struct node*left;
     struct nide*right;
}*root=NULL;
int x=0;
void insert();
void inorder(struct node*);
void preorder(struct node*);
void postorder(struct node*);
int main()
{
    int ch;
    do{
        printf("\n 1- Insert...");
        printf("\n 2-Inorder");
        printf("\n 3-Preorder");
        printf("\n 4-postorder");
        printf("\n 0-Exit");
        printf("\n Choise??....");
        scanf("%d ",&ch);
        switch(ch)
        {
             case 1:insert();break;
             case 2:inorder(root);break;
             case 3:preorder(root);break;
             case 4:postorder(root);break;
        }
    }while(ch!=0);
}
void insert()
{
     int item;
    struct node *n,*t,*p;

    n = (struct node *)malloc(sizeof(struct node));
     printf("\n Enter the item to insert");
    scanf("%d",&item);
    n->info=item;
    n->left=NULL;
    n->right=NULL;

    if(root==NULL)
        root =n;
    else
    {
        p=NULL;
        t=root;
        while(t!=NULL)
        {
            p=t;
            if(item < t->info)
                t=t->left;
            else
                t=t->right;
        }
        if(item < p->info)
            p->left=n;
        else
        p->right=n;
    }
    printf("\n %d is inserted",item);
}
void inorder(struct node *t)
{
    if(t!=NULL)
    {
        inorder(t->left);
        printf("%d \t",t->info);
        inorder(t->right);
    }
}
void preorder(struct node *t)
{
    if(t!=NULL)
    {
        printf("%d \t",t->info);
        preorder(t->left);
        preorder(t->right);
    }
}
void postorder(struct node *t)
{
    if(t!=NULL)
    {
        postorder(t->left);
        postorder(t->right);
         printf("%d \t",t->info);
    }
}
