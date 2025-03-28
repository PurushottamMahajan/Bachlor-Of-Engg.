package codes;
import java.util.ArrayList;

public class Permutations
{
	public static void printPer(String s, String per)
	{
		if(s.isEmpty())
		{
			System.out.println(per);
			return;
		}

		for(int x=0;x<s.length();x++)
		{
			char curr=s.charAt(x);
			String str=s.substring(0,x)+s.substring(x+1);
			printPer(str,per+curr);
		}
	}
	public static void Permutation(String s,String per)
	{
		if(s.isEmpty())
		{
			System.out.println(per);
			return;
		}

		char ch = s.charAt(0);
		for(int i=0;i<=	per.length();i++)
		{
			String fString=per.substring(0,i);
			String sString=per.substring(i,per.length());
			Permutation(s.substring(1),fString+ch+sString);
		}
	}
	
	public static int PermutationCount(String s,String per)
	{
		if(s.isEmpty())
			return 1;
		int count =0;
		char ch = s.charAt(0);
		for(int i=0;i<=	per.length();i++)
		{
			String fString=per.substring(0,i);
			String sString=per.substring(i,per.length());
			count = count +PermutationCount(s.substring(1),fString+ch+sString);
		}
		return count;

	}
	public static ArrayList<String> PermutationList(String s,String per)
	{
		if(s.isEmpty())
		{
			ArrayList<String>list = new ArrayList<>();
			list.add(per);
			return list;
		}
		ArrayList<String>ans = new ArrayList<>();

		char ch = s.charAt(0);
		for(int i=0;i<=	per.length();i++)
		{
			String fString=per.substring(0,i);
			String sString=per.substring(i,per.length());
			ans.addAll(PermutationList(s.substring(1),fString+ch+sString));
		}
		return ans;
	}
		public static void main(String args[])
	{
		printPer("abc","");
		System.out.println();
		Permutation("abc", "");
		System.out.println();
		System.out.println(PermutationList("abc", ""));
		System.out.println(PermutationCount("abc", ""));
	}
}