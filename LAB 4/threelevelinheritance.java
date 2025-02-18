class Animal//GRANDPARENT CLASS
{
    protected String animal_name;//PROTECTED VARIABLES

    Animal(String name)//CONSTRUCTOR CLASS
    {
        this.animal_name=name;

    }

}

class Mammal//PARENT CLASS
{
    protected String mammal_name;

    Mammal(String m,String a)
    {
        super(a);

        this.mammal_name=m;
        
    }

}

class Dog//CHILD CLASS
{
    protected String dog_name;

    public static void main(String[] args) 
    {
        Dog d=new Dog();//CHILD OBJECT

        d.dog_name="pitbull";//INIIALIZE BY OBJ

        Mammal m=new Mammal("human","cow");//OBJ CALL WITH ARGS 56


        
    }


}