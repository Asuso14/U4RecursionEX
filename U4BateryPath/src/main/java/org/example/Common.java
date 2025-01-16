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

    public static void UserMenuElection(){
        int election = 0;
        System.out.println("Elije una de las opciones del menu...");
        try {
            election = entry.nextInt();
        }catch (InputMismatchException error){
            UserElection();
        }
        switch (election){
            case 1:
                break;
            case 2:
                Exercises.investedNum(UserPositiveNumElection());
                break;
            case 3:
                Exercises.investedNum();
                break;
            case 4:
                if(Exercises.CheckBinaryValue(UserPositiveNumElection())){
                    System.out.println("El numero es binario");
                }else {
                    System.out.println("El numero no es binario");
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
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
    public static char[] CharVector(int value){
        return new char[]{(char) value};
    }
}
