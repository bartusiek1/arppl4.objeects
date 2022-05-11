package pl.sda.arp4.objects.kalkulator;

import java.util.Scanner;

public class MainKalkulatorIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        int wynik = 0;

        System.out.println("Podaj liczbę pierwszą:");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("Podaj liczbę drugą:");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Wybierz dzialanie: dodaj/odejmij/pomnóż/podziel");
        String dzialanie = scanner.next();

        if ("dodaj".equals(dzialanie)) {
            wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
        } else if ("odejmij".equals(dzialanie)) {
            wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
        } else if ("pomnóż".equals(dzialanie)) {
            wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
        } else if ("podziel".equals(dzialanie)) {
            try {
                // try - blok kodu, w którym może wystąpić nłąd
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                // catch - blok, który wywoła się tylko jeśli wystąpi
                // błąd i go złapiemy
                System.out.println("Nie można dzielić przez 0");
            }

            System.out.println("Wynik = " + wynik);
        }
    }
}
