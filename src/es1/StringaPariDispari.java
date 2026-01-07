package es1;


import java.util.Scanner;

public class StringaPariDispari {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Scrivi il tuo nome");
        String name = sc.nextLine();

        int numeroCaratteri = name.length();
        boolean res;

        if (numeroCaratteri % 2 == 0) {
            res = true;
        } else {
            res = false;
        }
        System.out.println("Il numero di caratteri è pari?" + " " + res);
        System.out.println("Il nome è lungo" + " " + numeroCaratteri + " " + "caratteri.");


    }
}
