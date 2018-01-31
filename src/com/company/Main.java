package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /* Parasyti programa, kuri paprasytu sveiko skaiciaus
	    ir pasakytu ar tas skaicius dalinasi is 3 arba 5 arba 7
	     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int sk = sc.nextInt();
        boolean arRado = false;
        if (sk % 7 == 0) {
            System.out.println("Skaicius dalinasi is 7.");
            arRado = true;
        }
        if (sk % 5 == 0) {
            System.out.println("Skaicius dalinasi is 5.");
            arRado = true;
        }
        if (sk % 3 == 0) {
            System.out.println("Skaicius dalinasi is 3.");
            arRado = true;
        }
        if (!arRado) {
            System.out.println("Nesidalina is nieko.");
        }
    }
}
