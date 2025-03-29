package OOPs;

class Main
{
    public static void main(String args[])
    {
        System.out.println(" Main Method");

        int a[]={11,22,55,5};
         main(a);
    }
    public static void main(int[] args)
    {
      System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args)
    {
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args)
    {
        System.out.println("Overloaded Double array Main Method");
    }
    public static void main(float[] args)
    {
        System.out.println("Overloaded float Main Method");
    }
}
