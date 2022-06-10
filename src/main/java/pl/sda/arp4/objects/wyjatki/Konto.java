package pl.sda.arp4.objects.wyjatki;

public class Konto {

    private double iloscSrodkow;

    public double podajIloscSrodkow() {
        return iloscSrodkow;
    }

    public void wykonajPrzelew (double kwota1) throws SrodkiNaKoncieException {
        if (iloscSrodkow < kwota1) {
            throw new SrodkiNaKoncieException("Błąd przelwwu, brak środków!");
        }
        iloscSrodkow = iloscSrodkow - kwota1;
    }

    public void przelewPrzychodzacy (double kwota2) {
        iloscSrodkow = iloscSrodkow + kwota2;
    }
}
