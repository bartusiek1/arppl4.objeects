package pl.sda.arp4.objects.przykład1;

import java.util.Scanner;

public class MainPojazd {
    public static void main(String[] args) {

        // wypisanie wszystkich dostępnych opcji ENUM
        for (RodzajPojazdu rodzajPojazdu : RodzajPojazdu.values()) {        // alt + Enter -> iterate
            System.out.println(rodzajPojazdu);
        }
        Scanner scanner = new Scanner(System.in);
        // użytkownik wpisuje coś do scannera
        // a w wyniku chcę otrzymać zmienną typu RodzajPojazdu

        RodzajPojazdu zmienna = null;
        while (zmienna == null) {

            System.out.println("Podaj rodzaj pojazdu");
            String rodzajString = scanner.next();
            try {

                // zamiast pisać IF/else dla wszystkich rodzajó i porównywać
                // możemy zastosować metodę .valueof któa generowana jest
                // dla każdego typu wyliczeniowego (ENUM)

                zmienna = RodzajPojazdu.valueOf(rodzajString.toUpperCase());

            } catch (IllegalArgumentException iae) {
                System.out.println("Wybrana opcja nie istnieje");
            }
        }
        System.out.println(zmienna);
    }
}