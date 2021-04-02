import java.util.Scanner;

public class SumPrimeNum {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();

        int count = 0;
        int flag = 0;
        for (int i = 2; flag < m; i++) {

            if(isPrime(i))  flag++;

            if(isPrime(i) && flag >= n && flag <= m){
                count += i;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n){
        for(int i = 2; i < (int)Math.sqrt(n) + 1; i++){
            if(n % i == 0)    return false;
        }
        return true;
    }
}
