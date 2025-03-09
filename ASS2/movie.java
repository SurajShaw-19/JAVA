public class movie 
{
    String title;
    String genre;
    int duration;
    double rating;

    //CONSTRUCTOR METHOD FOR INITIALIZE
    public movie(String t,String g,int d,double r)
    {
        this.title=t;
        this.genre=g;
        this.duration=d;
        this.rating=r;
    }

    //METHOD TO DISPLAY
    public void display()
    {
        System.err.print(title);

    }
    
    public static void main(String[] args) 
    {
        System.out.print("All Movies Titles:-");
        movie m1=new movie("Avtar","Fantasy",165,9.1);
        
        //NEW OBJ CREATED
        movie m2=new movie("Endgame","Cinematic",210,9.8);
        
        movie m3=new movie("Godzilla","Creature",195,8.4);

        //METHOD CALL FOR DISPLAY
        System.out.print("\n1.");
        m1.display();
        System.out.print("\n2.");
        m2.display();
        System.out.print("\n3.");
        m3.display();

    }
    
}
