package es1;


import java.util.Scanner;

public class StringaPariDispari {
    public static boolean stringaPariDispari(String text) {

        int numeroCaratteri = text.length();


        if (numeroCaratteri % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Scrivi il tuo nome");
        String text = sc.nextLine();


        System.out.println("Il numero di caratteri è pari?" + " " + stringaPariDispari(text));
        System.out.println("Il nome è lungo" + " " + text.length() + " " + "caratteri.");


    }
}
