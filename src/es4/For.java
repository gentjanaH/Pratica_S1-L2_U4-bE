package es4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi il numero dal quale parte il conto alla rovescia!");
        int num = sc.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
