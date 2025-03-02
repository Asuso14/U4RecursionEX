package org.example;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        do{
            Common.Menu();
            Common.UserElection();
            Common.UserElection();
            Common.CleanTerminal();
        }while (Common.UserElection());
    }
}