package pl.sda.arp4.objects.modele;

public class Mis {


    public Mis(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Mis{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {

        this.imie = imie;
    }

    public int getWiek() {

        return wiek;
    }

    public void setWiek(int wiek) {

        this.wiek = wiek;
    }

    public static void main(String[] args) {



    }

       private String imie;
       private int wiek;

}
