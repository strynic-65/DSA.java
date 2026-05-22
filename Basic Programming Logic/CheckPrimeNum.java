import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num: ");

        int num = sc.nextInt();
        
        boolean isPrime = true;

        // Prime number are greater than 1
        if(num <= 1){
            isPrime = false;
        } else {
            // Check divisibility from 2 to num/2
            for(int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(num + " is a Prime Number ");
        }else{
            System.out.println(num + " is not a Prime Number ");
        }
        sc.close();


    }
    
}
