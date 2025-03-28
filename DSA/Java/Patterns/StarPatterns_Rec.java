package codes;
public class StarPatterns_Rec {
    public static void main(String[] args) {
        Pattern1(4,0);
        Pattern2(4,0);
        
    }
    static void Pattern1(int r , int c )
    {
        if(r==0)
            return;
        if(c<r)
        {
            System.out.print("*");
            Pattern1(r,c+1);
        }
        else  
        {
            System.out.println();
            Pattern1(r-1,0);
        }
    

    }
    static void Pattern2(int r , int c )
    {
        if(r==0)
            return;
        if(c<r)
        {
            Pattern2(r,c+1);
            System.out.print("*");
            
        }
        else  
        {
            Pattern2(r-1,0);
            System.out.println();
            
        }
    

    }
}
