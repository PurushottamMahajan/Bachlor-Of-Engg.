package codes;
public class NumberPatterns
{
	public static void main(String a[])
	{
		Pattern01(5);
        System.out.println();
        Pattern02(5);
        System.out.println();
        Pattern03(5);
        System.out.println();
        Pattern04(5);
        System.out.println();
        Pattern05(5);
        System.out.println();
        Pattern06(5);
        System.out.println();
		Pattern07(5);
        System.out.println();
		Pattern08(5);
        System.out.println();
		Patetrn09(4);
		System.out.println();
		Patetrn10(4);
        
		
	}
	//Pattern 1 Right angled triangle of numbers form 1 to 10
	// 1
	// 12
	// 123
	// 1234
	// 12345
	static void Pattern01(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	//Pattern 2
	// 1 2 3 4 5
	// 1 2 3 4
	// 1 2 3
	// 1 2
	// 1
	static void Pattern02(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	//Pattern 3 Reversed Right angled triangle of numbers form 1 to 10
	// 12345
	// 1234
	// 123
	// 12
	// 1
	static void Pattern03(int n)
	{
		for(int i=n;i>0;i--)
 		{
 			for(int j=1;j<=i;j++)
 			{
 				System.out.print(j+" ");
 			}
 			System.out.println();
 		}
	}
	//Pattern 4
	// 5 5 5 5 5
	// 4 4 4 4
	// 3 3 3
	// 2 2
	// 1
	static void Pattern04(int n)
	{
		for(int i=n;i>0;i--)
 		{
 			for(int j=1;j<=i;j++)
 			{
 				System.out.print(i+" ");
 			}
 			System.out.println();
 		}
	}
	//Pattern 5 Right angle pattern of numbers of n rows and n colns
	// 1  
	// 2  3  
	// 4  5  6  
	// 7  8  9  10  
	// 11  12  13  14  15  
	static void Pattern05(int n)
	{
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num +"  ");
				num++;
			}
			System.out.println();
		}
	}
	//Pattern \6 
	// 0  
	// 1  0  
	// 0  1  0  
	// 1  0  1  0  
	// 0  1  0  1  0
	static void Pattern06(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2!=0)
				System.out.print("1  ");
				else
				System.out.print("0  ");


			}
			System.out.println();
		}
	}
	//Pattern7 Pyramid 
	//        1 
	//      2 1 2 
	//    3 2 1 2 3 
	//  4 3 2 1 2 3 4 
	//5 4 3 2 1 2 3 4 5 
	static void Pattern07(int n)
	{
		for(int i=1; i<=n; i++)
			{
		//spaces
		for(int j=1; j<=n-i; j++) {
			System.out.print("  ");
		}

		//numbers
		for(int j=i; j>=1; j--) {
			System.out.print(j+" ");
		}
		for(int j=2; j<=i; j++) {
				System.out.print(j+" ");
		}
			System.out.println();
		}
		}
	//Pattern 8
	//         1
	//       2 1 2
	//     3 2 1 2 3
	//   4 3 2 1 2 3 4
	// 5 4 3 2 1 2 3 4 5
	//   4 3 2 1 2 3 4
	//     3 2 1 2 3
	//       2 1 2
	//         1
	static void Pattern08(int n)
	{
		n=5;
		for(int i=1; i<n*2; i++)
		{
			int c=i>n?2*n-i:i;
			//spaces
			for(int j=1; j<=n-c; j++) {
				System.out.print("  ");
			}

			//numbers
			for(int j=c; j>=1; j--) {
				System.out.print(j+" ");
			}
			for(int j=2; j<=c; j++) {
					System.out.print(j+" ");
			}
				System.out.println();
			}
	}
	//Pattern 09:
	// 0 0 0 0 0 0 0 0 0 
	// 0 1 1 1 1 1 1 1 0
	// 0 1 2 2 2 2 2 1 0
	// 0 1 2 3 3 3 2 1 0
	// 0 1 2 3 4 3 2 1 0
	// 0 1 2 3 3 3 2 1 0
	// 0 1 2 2 2 2 2 1 0
	// 0 1 1 1 1 1 1 1 0
	// 0 0 0 0 0 0 0 0 0
	static void Patetrn09(int n)
	{
		 n=2*n;
		 for(int i=0;i<=n;i++)
		 {
			for(int j=0;j<=n;j++)
			{
				int value=Math.min(Math.min(i,j), Math.min(n-i,n-j));
				System.out.print(value+" ");
			}
			System.out.println();
		 }


	}
	//Pattern 10:
	// 4 4 4 4 4 4 4 4 4
	// 4 3 3 3 3 3 3 3 4
	// 4 3 2 2 2 2 2 3 4
	// 4 3 2 1 1 1 2 3 4
	// 4 3 2 1 1 1 2 3 4 
	// 4 3 2 1 1 1 2 3 4
	// 4 3 2 2 2 2 2 3 4
	// 4 3 3 3 3 3 3 3 4
	// 4 4 4 4 4 4 4 4 4
	static void Patetrn10(int n)
	{
		int a=n;
		 n=2*n;
		 for(int i=0;i<=n;i++)
		 {
			for(int j=0;j<=n;j++)
			{
				int value=i==a&&j==a?1:a-Math.min(Math.min(i,j), Math.min(n-i,n-j));
				System.out.print(value+" ");
			}
			System.out.println();
		 }
	}
}


