import java.util.Scanner;
public class atm 
{
    double bank=1000;

    public void wthdr(double wdr) 
    {
        if(wdr>bank)
        {
            System.out.println("Insuffient balance");
            return;
        }
        bank-=wdr;
        System.out.println("Amount withdrawn successfully.");
    }

    public void deposit(double dep)
    {
        if(dep<0)
        {
            System.out.println("Enter the valid amount.");
            return;
        }
        bank+=dep;
        System.out.println("Amont deposited to account successfully");
    }

    public void check()
    {
        System.out.println("The current balance in account is:- " + bank);
    }



    public static void main(String[] args) 
    {
        System.out.println("WELCOME TO ATM SERVICES");
        Scanner sc=new Scanner(System.in);
        atm obj=new atm();
        int ch;
        do
        {
        
            System.out.println("\n1. WITHDRAW");
            System.out.println("2. DEPOSIT");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. STATEMENT");
            System.out.println("5. EXIT");
            System.out.println("PRESS THE RIGHT KEY TO PROCEED");

            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                System.out.println("Enter the amount to be withdraw:-");
                double wdr=sc.nextDouble();
                obj.wthdr(wdr);
                break;

                case 2:
                System.out.println("Enter the amount to be deposited:");
                double dep=sc.nextDouble();
                obj.deposit(dep);
                break;

                case 3:
                obj.check();
                break;

                /*case 4:
                obj.stm();*/

                case 5:
                System.err.println("THANK YOU FOR USING THE SERVICES.");
                break;

                default:
                System.err.println("Enter a valid choice");
            }
        }
        while(ch!=5);

        sc.close();
    }
    
}
