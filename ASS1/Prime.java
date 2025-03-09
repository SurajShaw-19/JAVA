import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the start range");
        int x = in.nextInt();
        System.out.print("Enter the end range");
        int y = in.nextInt();
        if(x>y)
        {
            System.out.print("Enter the valid range");
        }
        else
        {
            for(int i=x;i<=y;i++)
            {
                if(i==1 || i==2 || i==3 || i==5)
                {
                     System.out.println(i);
                }
                else if(i%2!=0 && i%3!=0 && i%5!=0)
                {
                    System.out.println(i);
                }
            }
        }
      
    } 
}