package es1;

import java.util.Scanner;

public class AnnoBisestile {
    public static boolean annoBisestile(int year) {


        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un anno qualsiasi");
        int year = sc.nextInt();

        System.out.println("L'anno inserito è bisestile?" + " " + annoBisestile(year));
    }
}
