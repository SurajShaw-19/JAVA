
public class car extends vehicle
{
    int numDoors;
    String fuelType;

    car(int x,String fuel)//CONSTRUCTOR CALL WITH AGRS
    {
        //super("asd",2014);
        numDoors=x;
        fuelType=fuel;
    }



    public static void main(String[] args) 
    {
        car c=new car(10,"diesel");

        c.model="CX2012AS84";//DIRECT PARENT VARIABLE ACCESS BY INHERITANCE
        c.year=2014;

        System.out.println("Car Model: "+c.model);
        System.out.println("Year: "+ c.year);
        System.out.println("Fuel type: "+c.fuelType);
        System.out.println("Numbers of doors: "+c.numDoors);



        
    }




    
    
    
}