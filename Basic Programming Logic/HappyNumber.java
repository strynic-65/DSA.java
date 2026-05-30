import java.util.Scanner;

public class HappyNumber{

    static int sumOfSquares(int n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    static boolean isHappy(int n){
        while(n != 1 && n != 4){
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(isHappy(num))
            System.out.println(num + " is a Happy Number");
        else
            System.out.println(num + "is not a Happy Number");

        sc.close();
    }
    
}
