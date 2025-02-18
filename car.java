
public class car
{
    String color;
    int year;
    String model;

    //CONSTRUCTOR METHOD FOR INITIALIZE
    public car(String clr,int yr,String ml)
    {
        this.color=clr;
        this.year=yr;
        this.model=ml;
    }

    public void display()
    {
        System.out.println("car details:-");
        System.out.println("Car model: " + model);
        System.out.println("Car made year:" + year);
        System.out.println("Car colour: " + color);

    }
    
    public static void main(String[] args) 
    {
        car obj=new car("blue",2014,"MI12D");

        //METHOD CALL FOR DISPLAY
        obj.display(); 
    }
    
}