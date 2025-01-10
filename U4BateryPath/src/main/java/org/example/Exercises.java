package org.example;

public class Exercises {

    public static void investedNum(int num){
        if (num >= 0 && num <= 10){
            System.out.print(num);
        }else {
            System.out.print(num%10);
            investedNum(num/10);
        }
    }
}
