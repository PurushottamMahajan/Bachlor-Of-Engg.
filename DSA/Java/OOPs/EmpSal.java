package OOPs;

import java.util .Scanner;
public class EmpSal
{
  int id;
  String name;
  double sal;
  static double total=0;
   public void getData()
   {
       try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter ID , NAME , Salary");
        id=in.nextInt();
        in.nextLine();
        name=in.nextLine();
        sal=in.nextDouble();
      }

      total+=sal;
    }

    public static void main(String args[])
    {
     EmpSal E[] = new EmpSal[3];
     System.out.println("Enter Data of Employees");

     for (int i=0;i<E.length;i++)
     {
       System.out.println("Employee "+(i+1));
        E[i]=new EmpSal();
        E[i].getData();
      }
       System.out.println("Average of Salary of "+E.length+" Employees ="+(total/E.length));
     }
  }




