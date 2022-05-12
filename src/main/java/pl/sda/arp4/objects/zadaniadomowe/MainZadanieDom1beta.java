package pl.sda.arp4.objects.zadaniadomowe;

import java.util.Scanner;

public class MainZadanieDom1beta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RodzajBiletu rodzaj = null;
        do {
//            Podaj rodzaj biletu (dostępne rodzaje: NORMLANY_GODZINA, ULGOWY_STUDENCKI, NORMALNY_CALODNIOWY):
//            System.out.println("Podaj rodzaj biletu (dostępne rodzaje: " + Arrays.toString(RodzajBiletu.values()) + "):");
            System.out.print("Podaj rodzaj biletu (dostępne rodzaje: ");
            for (RodzajBiletu rodzajBiletu : RodzajBiletu.values()) {
                System.out.print(rodzajBiletu + " ");
            }
            System.out.println("):");

            String wpisaneSlowo = scanner.next();
            try {
                rodzaj = RodzajBiletu.valueOf(wpisaneSlowo);
            } catch (IllegalArgumentException iae) {
                System.err.println("Nie ma takiej opcji.");
            }

        } while (rodzaj == null);

        System.out.println("Podaj ilość biletów które chcesz kupić:");
        int iloscBiletow = scanner.nextInt();

        System.out.println("Cena biletów to: " + (iloscBiletow * rodzaj.getCena()));
    }
}

