public class shape 
{
    double sidelenght;

    //CONSTRUCTOR
    public shape(double side)
    {
        this.sidelenght=side;
    }

    //DISPLAY METHOD
    public void display()
    {
        System.out.println("Perimeter:- " + 4*sidelenght );
        System.out.println("Area:- " + sidelenght*sidelenght);
    }

    

    public static void main(String[] args) 
    {
        //OBJ CREATED
        shape s1=new shape(12.8);
        shape s2=new shape(8.1);

        //TO DISPLAY
        s1.display();
        s2.display(); 
    }
    
}
