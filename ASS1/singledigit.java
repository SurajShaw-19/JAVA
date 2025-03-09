//PROGRAM TO FIND SUM OF DIGITS TILL SINGLE DIDGIT
public class singledigit 
{
    public static void main(String[] args)
    {
        int n=1249;
        if(n<=9)
        {
            System.out.println("Single digit given");
        }
    
        else
        {
            while(n>9)
            {
                int sum=0;
                while(n!=0)
                {
                    sum+=n%10;
                    n=n/10;
                }
                n=sum;
            } 
        }
        System.out.println("sum is :" + n);   

       
    }
}