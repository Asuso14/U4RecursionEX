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

    public static void investChain(int count, char [] UserChain){
        if (count == 0){
            System.out.print(UserChain[count]);
        }else {
            System.out.print(UserChain[count]);
            investChain(--count,UserChain);
        }
    }

    public static boolean AlphabeticalSort(int count, char [] UserChain){
        if (count<UserChain.length - 1){
            if(UserChain[count] <= UserChain[count+1]){
                return AlphabeticalSort(++count,UserChain);
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckBinaryValue(int num){
        if (num >= 9){
            if ((num % 10) == 0 || (num % 10) == 1){
                return CheckBinaryValue(num/10);
            }else {
                return false;
            }
        }
        return num == 0 || num == 1;
    }

    public static String ConvertToBinary (int num){
        if(num == 0 || num == 1) {
            return Integer.toString(num);
        }else {
            return ConvertToBinary(num / 2) + num % 2;
        }
    }
}


