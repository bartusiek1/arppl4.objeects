package pl.sda.arp4.interfejsy;

public class Radio implements UrządzenieWłączalne {
    public void wlacz() {
        System.out.println("Uruchamiam radio. Trala la la la...");
    }

    public void wylacz() {
        System.out.println("Radio wyłączone");
    }
}
