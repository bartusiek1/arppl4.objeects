package pl.sda.arp4.interfejsy.zadanieIshapes;

public class Cywil extends Osoba {

    public Cywil(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void przedstawSie() {
//        Nazywam się {IMIE} {NAZWISKO}, jestem obywatelem Polskim!
        System.out.println("Nazywam się " + imie + " " + nazwisko + ", jestem obywatelem Polskim!");
    }
}