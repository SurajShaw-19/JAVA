import java.util.Scanner;
public class product 
{
    static int id;  //STATIC VARIABLES
    static String name;
    static double price;
    static int qty;

    public void discount(double disc)
    {
        price-= price * (disc/100);

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //NEW OBJ CREATED
        product p=new product();

        //STATIC METHOD ACCESS STATIC VARIABLE DIRECTLY
        // INITIALIZE
        id=142;
        name="Laptop";
        price=143;
        qty=1;

        System.out.println("Product id:- " + id);
        System.out.println("Name:- "+ name);
        System.out.println("Price:- " + price);
        System.out.println("Quantity:- " + qty);


        System.err.println("Enter the discount(in %):-");
        double disc=sc.nextDouble();

        //METHOD CALL FOR DISC UPDATION
        p.discount(disc);
        System.out.println("Discount added successfully");
        System.out.println("After disc price: " + price);

        sc.close();
    }
}
