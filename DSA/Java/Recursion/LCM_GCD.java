package Recursion;
public class LCM_GCD {
    public static void main(String[] args) {
        System.out.println(lcm(2,8));
        System.out.println(gcd(2,8));
    }
    static int lcm(int n , int m)
    {
        return n*m/gcd(n,m);
    }
    static int gcd(int n,int m)
    {
      if(n==0) return m;

      return gcd((m%n),n);
    }
}
