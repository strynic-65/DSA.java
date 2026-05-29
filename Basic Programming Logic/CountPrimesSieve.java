import java.util.Scanner;

public class CountPrimesSieve {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i <= N; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= N; i++){
            if(isPrime[i]) {
                for(int j = i * i; j <= N; j += i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i <= N; i++){
            if(isPrime[i]){
                count++;
            }
        }

        System.out.println("Number of primes up to " + N + " = " + count);

        sc.close();
    }
    
}
