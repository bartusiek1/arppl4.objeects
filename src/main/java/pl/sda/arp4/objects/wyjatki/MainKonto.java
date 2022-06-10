package pl.sda.arp4.objects.wyjatki;


// Konto powinno posiadać pole:
//
//    ilość środków
//
//metody:
//
//    podaj ilosc srodkow (wypisuje stan konta)
//    wykonaj przelew (od obecnego stanu konta odejmuje kwotę podaną w parametrze)
//    przelew przychodzący (do obecnego stanu konta dodaje kwotę podaną w parametrze)

public class MainKonto {
    public static void main(String[] args) {

Konto k = new Konto();

// Sprawdzanie stanu konta

double ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);


        // zasilanie konta

        k.przelewPrzychodzacy(1050);
        ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);

        try {
            k.wykonajPrzelew(1000);
            System.out.println("Sukces przelewu");
        } catch (SrodkiNaKoncieException re) {
            System.out.println("Błąd " + re.getMessage());
            }
        ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);
    }
}
