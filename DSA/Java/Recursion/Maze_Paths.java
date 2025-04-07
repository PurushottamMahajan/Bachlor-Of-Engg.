package Recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class Maze_Paths
{
	public static int count(int i, int j , int n,int m)
	{
		if(i==n || j==m)
		return 0;

		if(i==n-1 && j==m-1)
		return 1;

		int p1=count(i+1,j,n,m);
		int p2=count(i,j+1,n,m);

		return p1+p2;
	}
	static void PrintPathsRD(String s,int i, int j,int n , int m )//Only Right and Down Move is allowed
	{
		if(i==n || j==m)
		return;

		if(i==n-1 && j==m-1)
		 System.err.println(s);

		PrintPathsRD(s+"D",i+1,j,n,m);
		PrintPathsRD(s+"R",i,j+1,n,m);
	}
	static ArrayList<String> ListPathsRD(String s,int i, int j,int n , int m )//Only Right and Down Move is allowed
	{
		if(i==n || j==m)
		{
			return new ArrayList<String>();
		}

		if(i==n-1 && j==m-1)
		{
			ArrayList<String> list=new ArrayList<>();
			list.add(s);
			return list;
		}
		
		ArrayList<String> list=new ArrayList<>();
		list.addAll(ListPathsRD(s+"D",i+1,j,n,m));
		list.addAll(ListPathsRD(s+"R",i,j+1,n,m));
	
		return list;
	}
	static void PrintPathsVDH(String s,int i, int j,int n , int m )//Only Right and Down Move is allowed
	{
		if(i==n || j==m)
		return;

		if(i==n-1 && j==m-1)
		 System.err.println(s);

		PrintPathsVDH(s+"V",i+1,j,n,m);
		PrintPathsVDH(s+"D",i+1,j+1,n,m);
		PrintPathsVDH(s+"H",i,j+1,n,m);
	}
	static ArrayList<String> ListPathsVDH(String s,int i, int j,int n , int m )//Only Right and Down Move is allowed
	{
		if(i==n || j==m)
		{
			return new ArrayList<String>();
		}

		if(i==n-1 && j==m-1)
		{
			ArrayList<String> list=new ArrayList<>();
			list.add(s);
			return list;
		}
		
		ArrayList<String> list=new ArrayList<>();
		list.addAll(ListPathsVDH(s+"V",i+1,j,n,m));
		list.addAll(ListPathsVDH(s+"D",i+1,j+1,n,m));
		list.addAll(ListPathsVDH(s+"H",i,j+1,n,m));
	
		return list;
	}
	static void PrintPathsRestrictions(String s,boolean [][] maze,int i, int j,int n , int m )//Only Right and Down Move is allowed
	{
		if(i==n || j==m)
		return;

		if(!maze[i][j])
		return;

		if(i==n-1 && j==m-1)
		if(i==maze.length-1 || j==maze[0].length-1){
			System.out.println(s);
			return;
		   }

		 PrintPathsRestrictions(s+"D",maze,i+1,j,n,m);
		 PrintPathsRestrictions(s+"R",maze,i,j+1,n,m);
	}
	static void PrintAllPaths(String s,boolean [][] maze,int i, int j,int n , int m )//Only Right and Down Move is allowed
	{
		
		if(i==maze.length-1 && j==maze[0].length-1){
			System.out.println(s);
			return;
		   }

		if(!maze[i][j])
		return;

		maze[i][j]=false;

		if(i<maze.length-1)
		 PrintAllPaths(s+"D",maze,i+1,j,n,m);
		if(j<maze[0].length-1)
		 PrintAllPaths(s+"R",maze,i,j+1,n,m);
		if(i>0)
		 PrintAllPaths(s+"U",maze,i-1,j,n,m);
		if(j>0)
		 PrintAllPaths(s+"L",maze,i,j-1,n,m);

		 maze[i][j]=true;
	}
	static void PrintAllPathsSteps(String s,boolean [][] maze,int i, int j,int n , int m ,int [][]paths,int steps)//Only Right and Down Move is allowed
	{
		
		if(i==maze.length-1 && j==maze[0].length-1){
			paths[i][j]=steps;
			for(int [] arr :paths)
			{
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(s);
			System.out.println();
			return;
		   }

		if(!maze[i][j])
		return;

		maze[i][j]=false;
		paths[i][j]=steps;

		if(i<maze.length-1)
		 PrintAllPathsSteps(s+"D",maze,i+1,j,n,m,paths,steps+1);
		if(j<maze[0].length-1)
		 PrintAllPathsSteps(s+"R",maze,i,j+1,n,m,paths,steps+1);
		if(i>0)
		 PrintAllPathsSteps(s+"U",maze,i-1,j,n,m,paths,steps+1);
		if(j>0)
		 PrintAllPathsSteps(s+"L",maze,i,j-1,n,m,paths,steps+1);

		 maze[i][j]=true;
		 paths[i][j]=0;
	}
	public static void main(String args[])
	{
		int n=3;
		int  m=3;
		// System.out.println("Total Paths -->"+count(0,0,n,m));
		// PrintPathsRD("",0,0,n,m);
		// System.out.println();
		// System.out.println(ListPathsRD("", 0, 0, n, m));
		// System.out.println();
		// PrintPathsVDH("",0,0,n,m);
		// System.out.println();
		// System.out.println(ListPathsVDH("", 0, 0, n, m));

		boolean[][] maze = {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		//PrintPathsRestrictions("", maze, 0,0,n,m);
		PrintAllPaths("", maze, 0, 0, n, m);
		PrintAllPathsSteps("", maze, 0, 0, n, m,new int [maze.length][maze[0].length],1);
	}
}