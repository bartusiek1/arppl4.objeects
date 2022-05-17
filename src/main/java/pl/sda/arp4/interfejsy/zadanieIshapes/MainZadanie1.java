package pl.sda.arp4.interfejsy.zadanieIshapes;

import java.util.Scanner;


// Stwórz program, który przyjmuje od użytkownika linię tekstu i zlicza ilość kropek i przecinków, które
//występują w tekście, a następnie wypisuje ich ilości na ekran (na konsoli).

public class MainZadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");

        String tekst = scanner.nextLine();

        int liczbaKropek = 0, liczbaPrzecinkow = 0;

        // dla każdego znaku z tablicy 'tablica'
//        char[] tablica = tekst.toCharArray();
//        for (char znak : tablica) {
//            if (znak == '.') {
//                liczbaKropek++;
//            } else if (znak == ',') {
//                liczbaPrzecinkow++;
//            }
//        }
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (znak == '.') {
                liczbaKropek++;
            } else if (znak == ',') {
                liczbaPrzecinkow++;
            }
        }
        System.out.println("W tekście wystąpiło: " + liczbaKropek + " kropek, " + liczbaPrzecinkow + " przecinków.");
    }
}

