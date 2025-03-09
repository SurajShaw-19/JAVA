public class patternA
{
    public static void main(String[] args) {
        
        for(int i=1 ; i<=6;i++){
            for(int j=1;j<=12;j++)
            {
                if(i+j == 7 || j-i == 5 ||(i==4 && (i+3==j || i+1==j )) )
                {

                    System.out.print("+");
                }
                else
                {
                    System.out.print(" ");

                }
                    
            }
            System.out.printf("\n");

            
        }
      
        
    }
}