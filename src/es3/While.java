package es3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un testo, digita :q per uscire");
        String testo = sc.nextLine();

        while (!testo.equals(":q")) {
            System.out.println(String.join(",", testo.split("")));
            testo = sc.nextLine();
        }
    }
}
