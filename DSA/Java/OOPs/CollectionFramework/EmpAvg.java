package OOPs;

import java.util .Scanner;
class EmpAvg
{
  int id;
  String name;
  double sal;
 static double t=0;
   public void getData()
   {
       try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter ID , NAME , Salary");
        id=in.nextInt();
        in.nextLine();
        name=in.nextLine();
        sal=in.nextDouble();
      }

      t+=sal;
    }

    public static void main(String args[])
    {
     EmpAvg E[] = new EmpAvg[3];
     System.out.println("Enter Data of Employees");

     for (int i=0;i<E.length;i++)
     {
       System.out.println("Employee "+(i+1));
        E[i]=new EmpAvg();
        E[i].getData();
      }
       System.out.println("Average of Salary of "+E.length+" Employees ="+(t/E.length));
     }
  }




