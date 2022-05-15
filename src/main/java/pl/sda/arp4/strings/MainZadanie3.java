package pl.sda.arp4.strings;

// Wczytaj od użytkownika jedną linię tekstu i przypisz ją do zmiennej text a następnie wczytaj od użytkownika słowo
// i przypisz je do zmiennej searched. Następnie przeszukaj tekst w poszukiwaniu słowa przypisanego
// do zmiennej searched.

import java.util.Locale;
import java.util.Scanner;

public class MainZadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź linię tekstu:");
        String tekst = scanner.nextLine();

        System.out.println("Wpisz jedno słowo");
        String searched = scanner.next();

        System.out.println(tekst.toLowerCase().contains(searched));
    }
}
