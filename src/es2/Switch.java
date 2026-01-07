package es2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi un numero da 0 a 3");
        int num = sc.nextInt();
        switch (num) {
            case 0: {
                System.out.println("zero");
                break;
            }
            case 1: {
                System.out.println("uno");
                break;
            }
            case 2: {
                System.out.println("due");
                break;
            }
            case 3: {
                System.out.println("tre");
                break;
            }
            default:
                System.out.println("Numero errato");
        }
    }
}
