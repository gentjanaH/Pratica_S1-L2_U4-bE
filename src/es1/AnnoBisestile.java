package es1;

import java.util.Scanner;

public class AnnoBisestile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un anno qualsiasi");
        int year = sc.nextInt();
        boolean annoBisestile;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            annoBisestile = true;
        } else {
            annoBisestile = false;
        }

        System.out.println("L'anno inserito è bisestile?" + " " + annoBisestile);
    }
}
