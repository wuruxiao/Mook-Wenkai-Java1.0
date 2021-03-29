import java.util.Scanner;

public class SymbolNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = symbolNum(N);
        System.out.print(result);
    }

    public static int symbolNum(int n){
        int result = 0;
        int count = 0;
        while(n != 0){
            int m;
            int item = n % 10;
            n /= 10;
            count++;

            if(isSingle(item) == isSingle(count))
                m = 1;
            else
                m = 0;

            result += (m * Math.pow(2.0, (count-1)));
        }
        return result;
    }

    public static boolean isSingle(int n){
        return n % 2 == 1;
    }
}
