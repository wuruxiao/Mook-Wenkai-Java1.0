package com.wuruxiao.MookWenk.TimeTrans;

import java.util.Scanner;

public class TimeTrans {

    public static void main(String[] args) {

        //read an integer means Beijing-Time
        Scanner in = new Scanner(System.in);
        int beijingTime = in.nextInt();

        if(beijingTime >= 0 || beijingTime <= 2359){

            //calculate the hour of the UTC - Time
            int hour = beijingTime / 100;
            hour -= 8;
            if(hour < 0)
                hour += 24;

            int minute = beijingTime % 100;

            System.out.println(hour * 100 + minute);
        }
    }
}
