package pl.sda.arp4.objects.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        int wynik;

        System.out.println("Podaj liczbę pierwszą:");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("Podaj liczbę drugą:");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Wybierz dzialanie: dodaj/odejmij/pomnóż/podziel");
        String dzialanie = scanner.next();

        switch (dzialanie) {
            case "dodaj":
                wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
                break;
            case "odejmij":
                wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
                break;
            case "pomnóż":
                wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
                break;
            case "podziel":
                try {
                    // try - blok kodu, w którym może wystąpić nłąd
                    wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                    System.out.println("Wynik = " + wynik);
                } catch (ArithmeticException nazwaZmiennejWyjatku) {
                    // catch - blok, który wywoła się tylko jeśli wystąpi
                    // błąd i go złapiemy
                    System.out.println("Nie można dzielić przez 0");
                }
                break;
        }
    }
}
