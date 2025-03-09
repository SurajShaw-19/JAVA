import java.util.Scanner;
class Box
{
    float width;
    float height;
    float depth;
    float vol;

    void volume()
    {
        this.vol= width*height*depth;
        System.out.print("The volume of he box is:- " + vol);
    }    
}

class Boxweight extends Box
{
    //float weight;
    float distance;
    float cost;
    float totalcost;

    void shippingcost()
    {
        this.totalcost= cost*distance*vol;
        System.out.print("The total cost for the shippng of the box is:- " + totalcost);

    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        Boxweight b=new Boxweight();

        System.out.print("Enter the depth of the box:- ");
        b.depth=sc.nextFloat();

        System.out.print("Enter the height of the box:- ");
        b.height=sc.nextFloat();

        System.out.print("Enter the width of the box:- ");
        b.width=sc.nextFloat();

        b.volume();

        System.out.print("\nEnter the total km to be travel:- ");
        b.distance=sc.nextFloat();

        System.out.print("Enter the cost per km of the box:- ");
        b.cost=sc.nextFloat();

        b.shippingcost();
        sc.close();
    }
} 