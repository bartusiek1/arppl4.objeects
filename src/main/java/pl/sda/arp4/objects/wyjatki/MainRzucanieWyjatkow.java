package pl.sda.arp4.objects.wyjatki;

public class MainRzucanieWyjatkow {
    public static void main(String[] args) {
try {
    metoda();
} catch (Exception e) {
    System.out.println("Złapany");
}
    }
    // rekurencja

    public static void metoda() throws Exception {

       // niejawny
       //  throw new RuntimeException("Runtime Yo!");

        throw new Exception(" :(");
    }

    public static void drugaMetoda() {
        try {
            metoda();
        } catch (Exception e) {
            System.out.println("error happened");
        } finally {
            System.out.println("La la la la la ");
        }

    }
    }
