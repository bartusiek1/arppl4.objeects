package pl.sda.arp4.interfejsy.zadanieIshapes;

public class Zolnierz extends Osoba {
    private Ranga ranga;

//    public Zolnierz(String imie, String nazwisko, Ranga ranga) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.ranga = ranga;
//    }

    public Zolnierz(String imie, String nazwisko, Ranga ranga) {
        super(imie, nazwisko);
        this.ranga = ranga;
    }

    @Override
    public void przedstawSie() {
        //Tu {IMIE} {NAZWISKO}, {RANGA} Polskich sił zbrojnych!
        System.out.println("Tu " + imie + " " + nazwisko + ", " + ranga + " Polskich sił zbrojnych!");
    }
}