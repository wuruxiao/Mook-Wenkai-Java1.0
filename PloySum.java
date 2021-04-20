import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int count = 0;
        int[] item = new int[101];
        int maxsize = 0;
        Scanner in = new Scanner(System.in);
        while (count != 2) {
            
            int expen = in.nextInt();
            
            if(expen == 0)  count++;
            if(expen > maxsize) maxsize = expen;

            int coef = in.nextInt();

            item[expen] += coef;
        }
        in.close();

        boolean flag = false;
        for (int i = maxsize; i > 1; i--) {
            
            if(item[i] != 0){
                if(flag && item[i] > 0)    System.out.print("+");

                if(item[i] == 1){
                    System.out.print("x" + i);
                    flag = true;
                 
                }
                else if(item[i] == -1){
                    System.out.print("-x" + i);
                    flag = true;
                
                }
                else{
                    System.out.print(item[i] + "x" + i);
                    flag = true;
                }
            }  
        }
        if(item[1] != 0){
            if(flag && item[1] > 0)    System.out.print("+");

            if(item[1] == 1){
                System.out.print("x");
                flag = true;
            }
            else if(item[1] == -1){
                System.out.print("-x");
                flag = true;
            }
            else{
                System.out.print(item[1] + "x");
                flag = true;
            }
            
        }    
        if(item[0] != 0){
            if(flag && item[0] > 0)    System.out.print("+");
            System.out.print(item[0]);
        }    
    }
}