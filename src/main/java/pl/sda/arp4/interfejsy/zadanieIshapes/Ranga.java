package pl.sda.arp4.interfejsy.zadanieIshapes;

public enum Ranga {
    POLKOWNIK("Półkownik"),
    MAJOR("Major"),
    KAPITAN("Kapitan"),
    PORUCZNIK("Porucznik"),
    CHORAZY("Chorąży"),
    SIERZANT("Sierżant"),
    KAPRAL("Kapral");

    private final String nazwa;

    Ranga(String nazwa) {
        this.nazwa = nazwa;
    }

//    public String getNazwa() {
//        return nazwa;
//    }

    @Override
    public String toString() {
        return nazwa;
    }
}