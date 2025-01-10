package org.example;
public class Main {

    public static void main(String[] args) {
        do{
            Common.Menu();
            int election = Common.UserPositiveNumElection();
        }while (Common.UserElection());
    }
}