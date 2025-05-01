#include<iostream>
using namespace std;
#define MAX 5

class PizzaParlour{
    private:
    int front,rear;
    int order[MAX];
    public:
    PizzaParlour(){
        front=rear=-1;
    }
    void addOrder();
    void serveOrder();
    void display();
};

void PizzaParlour :: addOrder(){

    if(rear == -1)
    {
        int id;
        cout<<"Enter order ID";
        cin>>id;
        front = rear = 0;
        order[rear] = id;
    }
    else
    {
        int pos = (rear+1)%MAX;
        if(pos == front){
            cout<<"FULL";
        }
        else{
            int id;
            cout<<"Enter order ID";
            cin>>id;
            rear=pos;
            order[rear ]= id;
        }
    }
    cout<<"\n Order is placed...........\n\n";
}

void PizzaParlour :: serveOrder(){
    if(front==-1){
        cout<<"No Orders in Cafe";
        return;
    }else{
        cout<<"Ordered No. "<<order[front]<<" is proccessed .\n";
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%MAX;
        }
    }
}
void PizzaParlour::display()
{
    if(front ==-1)
    {
        cout<<"Empty ...No orders";
        return;

    }

   for(int i=front;i!=rear;i=((i+1)%MAX))
   {

       cout<<order[i]<<"\t";
   }
   cout<<order[rear]<<"\t";
}
int main(){

     PizzaParlour p;
  int x;
  int ch;
do
{
    cout<<"\n1 Place order \n2 Serve order\n3 Display \n4 Exit"<<endl;
    cin>>ch;
    switch(ch)
    {
        case 1:p.addOrder();break;
        case 2:p.serveOrder();break;
        case 3:p.display();break;
        case 4:break;break;
    }
}while(ch!=4);
}
