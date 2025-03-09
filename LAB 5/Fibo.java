//FIBONACCI SERIES
public class Fibo {
       
    public static void main(String[] args) {


        int a = 0, b = 1, sum;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 2; i < 15; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
    
}
