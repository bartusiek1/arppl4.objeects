package pl.sda.arp4.wyjatkiZadania;

// Napisz program który pyta użytkownika o dwie liczby (wykorzystaj program
// 1)  a następnie sprawdza czy druga liczba nie jest ==0.
// Jeśli jest, to wyrzuca wyjątek ‘CholeroException’ z komunikatem “Pamiętaj cholero, by nie dzielić przez zero!”.


import java.util.Scanner;

public class MainZadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą");
        int liczbaA = scanner.nextInt();


        System.out.println("Podaj kolejną licznę całkowitą");
        int liczbaB = scanner.nextInt();

        if (liczbaB == 0) {
            throw new CholeroException();
        } else {
            double wynikDzielenia = liczbaA / liczbaB;
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);
        }
    }
}