import java.util.ArrayList;
import java.util.Scanner;

/**
 * ReadNum
 */
public class ReadNum {

    public static void main(String[] args) {
        
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        int flag = 0;//控制输出数字和数字之间的空格
        /*提交代码时，把这些中文注释给去了，老师给的编码不支持中文*/

        if(n < 0){
            System.out.print("fu");
            flag = 1;
            n *= (-1);
        }   
        if(n == 0){
            System.out.print("ling");
            return;
        }
        
        var strlist = new ArrayList<String>();
        /*搞笑的是：老师给的老版本，不可以使用var 来定义类型，所以自己老老实实写全类型吧*/

        while (n != 0) {
            int i = n % 10;
            switch (i) {
                case 0:
                    strlist.add("ling");
                    break;

                case 1:
                    strlist.add("yi");
                    break;

                case 2:
                    strlist.add("er");
                    break;

                case 3:
                    strlist.add("san");
                    break;

                case 4:
                    strlist.add("si");
                    break;

                case 5:
                    strlist.add("wu");
                    break;

                case 6:
                    strlist.add("liu");
                    break;

                case 7:
                    strlist.add("qi");
                    break;

                case 8:
                    strlist.add("ba");
                    break;
            
                default:
                    strlist.add("jiu");
                    break;
            }
            n /= 10;
        }

        for(int i = strlist.size(); i > 0; i--){
            if(flag == 1)    System.out.print(" ");
            System.out.print(strlist.get(i - 1).toString());
            flag = 1;
        }
    }
}