package pl.sda.arp4.interfejsy.zadanieIshapes;

import java.util.Scanner;

public class MainZadanieDomowe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calosWpisanegoTekstu = "";

        String tekst;
        do {
            System.out.println("Podaj tekst:");
            tekst = scanner.nextLine();

            // jeśli ktoś napisał 'quit' to nie dodawaj go to tekstu 'caloscWpisanegoTekstu'
            if (!tekst.equalsIgnoreCase("koniec")) {
                calosWpisanegoTekstu = calosWpisanegoTekstu + tekst;
            }
        } while (!tekst.equalsIgnoreCase("koniec"));

        System.out.println("Tekst wpisany wyżej: " + calosWpisanegoTekstu);

        // calosWpisanegoTekstu = "Ala ma kota. Kot nie lubi Ali. Wszyscy lubią koty. Nikt nie lubi Ali."
        // Ala ma kota. Kot nie lubi Ali.
        // Wszyscy lubią koty. Nikt nie lubi Ali.
        // quit
        int liczbaKropek = 0, liczbaPrzecinkow = 0;
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (znak == '.') {
                liczbaKropek++;
            } else if (znak == ',') {
                liczbaPrzecinkow++;
            }
        }
        System.out.println("W tekście wystąpiło: " + liczbaKropek + " kropek, " + liczbaPrzecinkow + " przecinków.");
        System.out.println("Wprowadzono " + liczbaKropek + " zdań.");
    }
}
