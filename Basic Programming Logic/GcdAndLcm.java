import java.util.Scanner;

public class GcdAndLcm {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        //Find GCD using Eucliden Algo
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
         }

         int gcd = x;

         //Find Lcm 
         int lcm = (a * b) / gcd;

         //Output
         System.out.println("GCD = " + gcd);
         System.out.println("LCM = " + lcm);

         sc.close();
    }
    
}
