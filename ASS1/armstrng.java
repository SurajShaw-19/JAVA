class armstrng{
    public static void main(String[] args) {
        
        int res=0,c=0;
        int sum=0;

        int num=1634;
        int a=num;
        int n=num;
        while(n!=0)
        {
            c++;
            n=n/10;

        }
        
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            int s=res;

            for(int i=0;i<c-1;i++)
            {
                s=s*res;
            }
            sum+=s;


        }
        if (sum==a)
        {
            System.out.println("Armstrong ") ;
        }
        else{
            System.out.println("Not" );
        }




    }
}