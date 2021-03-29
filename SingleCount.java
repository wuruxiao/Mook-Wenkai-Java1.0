package com.wuruxiao.java1.SingleCount;

import java.util.Scanner;

public class SingleCount {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int item, count = 0, countSingle = 0;
        while(true){
            item = in.nextInt();
            if(item == -1){
                break;
            }

            if(item % 2 == 1){
                countSingle++;
            }
            count++;
        }

        System.out.print(countSingle + " " + (count - countSingle));
    }
}
