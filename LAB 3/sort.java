public class sort
{
    public static void main(String args[])
    {
        int arr[]={4,9,1,7,3};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }


    }

}