public class elementfind
{
    public static void main(String args[])
    {
        int []arr={7,9,4,3,8,1,6,1,11};
        int a=7,x=0;
        for (int i = 0; i < arr.length; i++) 
        {
            if(a==arr[i])
            {
                x=1;
                System.out.println("element found in array");
            }       
        }
        if(x==0)
        {
            System.out.println("Element not found");
        }
    } 
}
