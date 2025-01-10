package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Common {

    public static Scanner entry = new Scanner(System.in);

    public static void Menu(){
        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabético");
        System.out.println("7 - Mostrar suma");
    }

    public static int UserMenuElection(){
        
    }

    public static boolean UserElection(){
        System.out.println("Elije una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");
        String election = entry.next();
        if (!election.equalsIgnoreCase("X") && !election.equalsIgnoreCase("M")){
            System.out.println("a");
            return UserElection();
        }else {
            return !election.equalsIgnoreCase("X");
        }
    }

    public static int UserPositiveNumElection(){
        try {
            int num = entry.nextInt();
            if (entry.nextInt()<=0){return UserPositiveNumElection();}
            return num;
        }catch (InputMismatchException error){
            return UserPositiveNumElection();
        }
    }
}
