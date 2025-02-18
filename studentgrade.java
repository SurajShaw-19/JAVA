import java.util.Scanner;

public class studentgrade 
{
    static Scanner sc=new Scanner(System.in);//STATIC DECLARE FOR INPUT IN EVERY METHOD 
    String name;
    int roll;
    String subj[]={"math","science","sst","comp"};
    double marks[]=new double[subj.length];
    int t_marks=100 * subj.length;

    public double cal()
    {
        double total=0,input=0;
        for(int i=0;i<subj.length;)
        {
            System.out.println("Enter the marks for "+subj[i]);
            input=sc.nextDouble();
            
            if(input>0 && input<=100)
            {
                marks[i]=input;
                total+=input;
                i++;
            }

            else
            {
                System.out.println("Kindly re-enter the mark properly");
            }

        }
                
         System.out.println("The total marks of the student is:- " + total);
        
        return total;

    }

    public void grade(double total)
    {
        double percentage=(total/t_marks)*100;
        System.out.println("The Percentage scored by student is:- " + percentage + "%.");
        if(percentage>90)
        {
            System.out.println("The Grade scored by the student is:- 'O'");
        }
        
        else if(percentage>80)
        {
            System.out.println("The Grade scored by the student is:- 'E'");
        }

        else if(percentage>70)
        {
            System.out.println("The Grade scored by the student is:- 'A'");
        }

        else if(percentage>60)
        {
            System.out.println("The Grade scored by the student is:- 'B'");
        }

        else if(percentage>50)
        {
            System.out.println("The Grade scored by the student is:- 'C'");
        }

        else if(percentage>40)
        {
            System.out.println("The Grade scored by the student is:- 'D'");
        }

        else if(percentage<=40)
        {
            System.out.println("Sorry the student is unable to pass the exam");
        }


    }
    

    public static void main(String[] args) 
    {
        //CLASS OBJ FOR STUDENT 1
        studentgrade obj1=new studentgrade();

        double total=0;

        //INPUT FROM USER
        System.out.print("Enter the student name:- ");
        obj1.name=sc.nextLine();
        System.out.print("Enter the roll number:-");
        obj1.roll=sc.nextInt();
        System.out.println();//FOR NEW LINE 

        total = obj1.cal();//METHOD CALL FOR MARKS INPUT

        obj1.grade(total);//METHOD CALL FOR GRADE CALCULATION

        //CLASS OBJ FOR STUDENT 2
        studentgrade obj2=new studentgrade();
        System.out.println();

        double total2=0;

        //INPUT FROM USER
        System.out.print("Enter the student name:- ");
        obj2.name=sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the roll number:-");
        obj2.roll=sc.nextInt();
        System.out.println();//FOR NEW LINE

        total2 = obj2.cal();//METHOD CALL FOR MARKS INPUT

        obj2.grade(total2);//METHOD CALL FOR GRADE CALCULATION

        //CLASS OBJ FOR STUDENT 3
        studentgrade obj3=new studentgrade();

        double total3=0;

        //INPUT FROM USER
        System.out.print("Enter the student name:- ");
        obj3.name=sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the roll number:-");
        obj3.roll=sc.nextInt();
        System.out.println();//FOR NEW LINE

        total3 = obj3.cal();//METHOD CALL FOR MARKS INPUT

        obj3.grade(total3);//METHOD CALL FOR GRADE CALCULATION
        
        sc.close();
    }

    
    
}
