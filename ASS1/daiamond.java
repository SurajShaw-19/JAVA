//PROGRAM TO MAKE THE DIAMOND OULINE PATTERN
class daiamond {
    public static void main(String[] args) {
        int i,j;
        for( i=1; i<=7; i++)
        {
            for( j=1;j<=7;j++)
            {
                
                if( i<5 && i+j==5 )
                {
                    System.err.print("+");
                }
                else if (i<5 && j-i==3)
                {
                    System.err.print("+");

                }
                else if (i>4 && i-j==3)
                {
                    System.err.print("+");
                }

                else if(i>4 && i+j==11)
                {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
                    
                
            }
            System.err.println();
        }
    }
}
