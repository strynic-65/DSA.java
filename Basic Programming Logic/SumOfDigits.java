import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");

        int num = sc.nextInt();

        int sum = 0;

        //Find sum of digits
        while (num != 0){
            int digit = num % 10;
            sum = sum + digit ;
            num = num / 10;
        }

        // Output 
        System.out.println("Sum of digits = " + sum);

        sc.close();
    
    
    }


}