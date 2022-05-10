package pl.sda.arp4.objects;

public class MainMis {
    public static void main(String[] args) {
        Mis mis1 = new Mis("Jason",23);
     //   mis1.imie = "Jason";
      //  mis1.wiek = 23;
        System.out.println(mis1);

        Mis mis2 = new Mis("John", 19);
      //  mis2.imie = "John";
      //  mis1.wiek = 19;
        System.out.println(mis2);
        System.out.println("Był sobie Miś, który miał na imię: " + mis1.getImie());
        System.out.println("I miał lat: " + mis1.getWiek());
    }
}
