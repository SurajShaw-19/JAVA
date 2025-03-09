import java.util.Scanner;
public class Pattern{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i );
            }
            System.out.println();
        }
        in.close();
    } 
}