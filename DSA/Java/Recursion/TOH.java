package codes;
import java.util.Scanner;
class TOH
{
   public static void main(String []args)
   {
	   System.out.println("Enter number of Distks..........");
	   try (Scanner in = new Scanner(System.in)) {
		int n= in.nextInt();
		   TowerOfHanoi(n,"S","H","D");
	}
   	}
   	public static void TowerOfHanoi(int n , String src,String helper,String dest)
   	{
		if(n==1)
		{
			System.out.println("Transfering Disk	" +n+ "		From	"+ src +"		to	"+dest);
			return;

		}
		TowerOfHanoi(n-1,src,dest,helper);
		System.out.println("Transfering Disk	" +n+ "		From	"+ src +"		to	"+dest);
		TowerOfHanoi(n-1,helper,src,dest);

	}
}
