public class minmaxaray
{
    public static void main(String[] args) 
    {
        int arr[]={4,9,7,6,8};
        System.out.println("The max value is "+ max(arr));
        System.out.println("The min value is "+ min(arr));
    }
    public static int max(int x[])
    {
        int m=x[0];
        for (int i = 1; i < x.length; i++) 
        {
            if(m<x[i])
            {
                m=x[i];
            }
        }
        return m;
    }
    public static int min(int a[])
    {
        int min=a[0];
        for (int i = 1; i < a.length; i++) 
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        return min;
    }

}