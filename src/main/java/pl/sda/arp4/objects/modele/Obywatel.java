package pl.sda.arp4.objects.modele;

public class Obywatel {

    String imie;
    private String pesel;


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Obywatel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "imie='" + imie + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }


}
