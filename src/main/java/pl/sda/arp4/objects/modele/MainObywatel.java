package pl.sda.arp4.objects.modele;

import java.util.Scanner;

// Stwórz klasę Obywatel z imieniem i numerem pesel (przyjmij String). Stworz pełny konstruktor oraz gettery, settery i metodę toString.
//W klasie MainObywatel napisz nastepujaca logike:
//
//    Stworz scanner
//    Popros uzytkownika o podanie imienia
//    Popros uzytkownika o podanie numeru pesel
//    Stworz obiekt klasy Obywatel uzywajac konstruktora
//    Wypisz obiekt na ekran stosujac sout.


public class MainObywatel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie:");
        String podaneImie = scanner.next();

        System.out.println("Podaj numer PESEL:");
        String numerPesel = scanner.next();


        Obywatel obywatel1 = new Obywatel("numerPesel");
        obywatel1.imie = podaneImie;
        obywatel1.setPesel(numerPesel);

        System.out.println("Obywatel " + obywatel1.getImie() + " o numerze PESEL: " + obywatel1.getPesel());
    }
}
