package pl.sda.arp4.wyjatkiZadania;

//     Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b, i wyświetla wynik dzielenia a/b.
//     Jeżeli b jest zerowe program powinien wyświetlić odpowiedni komunikat.
//
//    Wariant 1: Zastosuj instrukcję if
//    Wariant 2: Zastosuj instrukcję try-catch


import java.util.Scanner;

public class MainZadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą");
        int liczbaA = scanner.nextInt();


        System.out.println("Podaj kolejną licznę całkowitą");
        int liczbaB = scanner.nextInt();

        // wariant 1

        if (liczbaB == 0) {
            System.out.println("Pamiętaj cholero by nigdy nie dzielić przez '0'");
        } else {
            double wynikDzielenia = liczbaA / liczbaB;
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);


            // wariant II

            //  try {
            //      double wynikDzielenia = liczbaA/liczbaB;
            //       System.out.println("Wynik dzielenia to: " + wynikDzielenia);
            //    } catch (ArithmeticException ae) {
            //       System.out.println("Pamiętaj cholero by nigdy nie dzielić przez '0'");
//
        }
    }
}
