package org.example;
import java.io.IOException;
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
                break;
            case 3:
                System.out.println("Opciones: ");
                System.out.println("1. Ordenar Numero");
                System.out.println("2. Ordenar Texto");
                switch (entry.next()){
                    case "1":
                        Exercises.investedNum(UserPositiveNumElection());
                        break;
                    case "2":
                        char [] temp = StringToChar(entry.next());
                        Exercises.investChain(temp.length,temp);
                        break;
                    default:
                        System.out.println("No has introducido una opcion valida, saliendo del programa...");
                        break;
                }
                break;
            case 4:
                if(Exercises.CheckBinaryValue(UserPositiveNumElection())){
                    System.out.println("El numero es binario");
                }else {
                    System.out.println("El numero no es binario");
                }
                break;
            case 5:
                Exercises.ConvertToBinary(UserPositiveNumElection());
                break;
            case 6:
                char[] temp = StringToChar(entry.next());
                if(Exercises.AlphabeticalSort(0,temp)){
                    System.out.println("Esta ordenado!!");
                }else {
                    System.out.println("No esta ordenado :C");
                }
                break;
            case 7:
                Exercises.NaturalSum(Common.UserPositiveNumElection(),1,1);
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
//    public static char[] IntToChar(int value){
//        return new char[]{(char) value};
//    }
    public static char[] StringToChar (String value){
        return value.toCharArray();
    }
    public static void CleanTerminal() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}