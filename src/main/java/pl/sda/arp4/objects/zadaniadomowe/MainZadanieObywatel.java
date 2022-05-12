package pl.sda.arp4.objects.zadaniadomowe;

import java.util.Arrays;
import java.util.Scanner;

public class MainZadanieObywatel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plec plec = null;
        do {
            System.out.println("Podaj plec (" + Arrays.toString(Plec.values()) + "): ");
            String wpisaneSlowo = scanner.next();
            try {
                plec = Plec.valueOf(wpisaneSlowo.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Nie ma takiej opcji.");
            }
        } while (plec == null);

        System.out.println("Podaj swoje imie:");
        String wpisaneImie = scanner.next();

        System.out.println("Podaj swoje nazwisko:");
        String wpisaneNazwisko = scanner.next();

        System.out.println("Podaj swoje pesel:");
        String wpisanePesel = scanner.next();

        ObywatelZadanieDom obywatel = new ObywatelZadanieDom(wpisaneImie, wpisaneNazwisko, wpisanePesel, plec);
        obywatel.przedstawSie();
    }
}
