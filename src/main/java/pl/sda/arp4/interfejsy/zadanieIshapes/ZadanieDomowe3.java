package pl.sda.arp4.interfejsy.zadanieIshapes;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieDomowe3 {

    // Stwórz program zgodnie z następującymi poleceniami:
    //a. Stwórz klasę abstrakcyjną Osoba. Klasa powinna mieć:
    //i. metodę abstrakcyjną przedstawSię():void.
    //ii. pole imie, oraz nazwisko.
    //b. Stwórz typ wyliczeniowy Ranga o wartościach:
    //i. POLKOWNIK,
    //ii. MAJOR,
    //iii. KAPITAN,
    //iv. PORUCZNIK,
    //v. CHORAZY,
    //vi. SIERZANT,
    //vii. KAPRAL
    //c. Stwórz klasę Żołnierz. Klasa powinna dziedziczyć po powyższej klasie Osoba.
    //i. Klasa powinna posiadać pole Ranga ranga,
    //ii. Żołnierz posiada implemtację metody przedstawSię():void która wypisuje komunikat
    //„Tu {IMIE} {NAZWISKO}, {RANGA} Polskich sił zbrojnych!”
    //d. Dodaj  do  Rangi  dodatkowe  pole  typu  String,  którego  wartość  odpowiada  nazwie  typu
    //wyliczeniowego,  podanego  małymi  literami,  rozpoczynające  się z  wielkiej  litery.  (Przykład:
    //POLKOWNIK („Półkownik”))
    //i. Zastosuj  zmianę  wprowadzoną  w  typie  wyliczeniowym  tak,  aby  była  wypisywana
    //zamiast wartości/nazwy typu wyliczeniowego.
    //e. Stwórz klasę Cywil, która dziedziczy po klasie Osoba i w swojej metodzie przedstawSię():void
    //wypisuje komunikat: „Nazywam się {IMIE} {NAZWISKO}, jestem obywatelem Polskim!”
    //f. Stwórz klasę startową Main. W klasie pozwól użytkownikowi podać:
    //i. Czy jest żołnierzem, jeśli tak, to jakiej rangi – stwórz obiekt typu Żołnierz
    //ii. Jeśli nie jest żołnierzem, to stwórz obiekt typu Cywil
    //iii. Pozwól użytkownikowi wypełnić swoje imie i nazwisko i na koniec wypisz komunikat
    //posługując się metodą przedstawSię():void.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Czy jesteś żołnierzem? (tak/nie)");
        String czyZolnierz = scanner.next();

        if (czyZolnierz.equalsIgnoreCase("tak")) {
            Ranga podanaRanga = null;
            do {
                System.out.println("Jaka jest Twoja ranga (" + (Arrays.toString(Ranga.values())) + "):");
                String rangaString = scanner.next();

                try{
                    podanaRanga = Ranga.valueOf(rangaString.toUpperCase());
                }catch (IllegalArgumentException iae){
                    System.out.println("Podana ranga nie istnieje...");
                }
            } while (podanaRanga == null);

            System.out.println("Podaj swoje imie:");
            String imie = scanner.next();
            System.out.println("Podaj swoje nazwisko:");
            String nazwisko = scanner.next();

            Osoba osoba = new Zolnierz(imie, nazwisko, podanaRanga);
            osoba.przedstawSie();
        } else if (czyZolnierz.equalsIgnoreCase("nie")) {
            System.out.println("Podaj swoje imie:");
            String imie = scanner.next();
            System.out.println("Podaj swoje nazwisko:");
            String nazwisko = scanner.next();

            Osoba osoba = new Cywil(imie, nazwisko);
            osoba.przedstawSie();
        }else{
            System.out.println("Czyli jesteś osiołkiem :)");
        }
    }
}

