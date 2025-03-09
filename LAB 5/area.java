import java.util.Scanner;

 class shape 
{
    float area;
    void find_area(float lenght,float breadth)
    {

        this.area=lenght*breadth;
        System.out.println("The area is:- " + area);

    }
    
}

class square extends shape
{
    float side;
    Scanner sc=new Scanner(System.in);

    void areasquare()
    {
        System.out.print("Enter the side lenght of square:- ");
        side=sc.nextFloat();
        find_area(side,side); 
        
        sc.close();
        
    }
}


class rectangle extends square
{
    float lenght, breadth;
   
}

public class area 
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        rectangle ar=new rectangle();

        System.out.print("Enter the lenght of the rectangle:-");
        ar.lenght=sc.nextFloat();

        System.out.print("Enter the breadth of the rectangle:-");
        ar.breadth=sc.nextFloat();

        ar.find_area(ar.lenght, ar.breadth);

        ar.areasquare();

        sc.close();
    }
}