package pl.sda.arp4.interfejsy.zadanieIshapes;

import java.util.Scanner;

public class MainZadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");

        String tekst = scanner.nextLine();

        char[] tablica = tekst.toCharArray();
        int liczbaKropek = 0, liczbaPrzecinkow = 0;

        // dla każdego znaku z tablicy 'tablica'
        for (char znak: tablica) {
            if (znak == '.') {
                liczbaKropek++;
            } else if (znak == ',') {
                liczbaPrzecinkow++;
            }
        }
        System.out.println("W tekście wystąpiło: " + liczbaKropek + "kropek, " + liczbaPrzecinkow + " przecinków");
    }
}
