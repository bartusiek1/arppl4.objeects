package pl.sda.arp4.strings;

import java.util.Scanner;

public class MainZadanie8 {
    public static void main(String[] args) {
/**
 * 8. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na poszczególne słowa.
 * Następnie aplikacja zlicza ilości wystąpień słów.
 *
 * Np. dla tekstu:
 *        ala lubi koty, ale ala nie jest przez koty lubiana
 *
 *  ala - 2
 *     lubi - 1
 *     koty - 2
 *     ale - 1
 *     nie - 1
 *     jest - 1
 *     przez - 1
 *     lubiana - 1
 */
        // substring & indexOf
        String tekst = "ala ma kota";

        // split podzieli zdanie na poszczególne słowa
        String[] slowa = tekst.split(" ");

        // "ala" "lubi" "koty,"

        // podmienianie znaku (replace / replaceAll)
        String kotyPrzecinek = "koty,";
        String wynikKotyBezPrzecinka = kotyPrzecinek.replaceAll(",", "");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();


    }
}


