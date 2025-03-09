import java.util.Scanner;
public class Pattern2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int n = in.nextInt();
        for(int i=n;i>0;--i)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        in.close();
    } 
}