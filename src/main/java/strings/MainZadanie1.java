package strings;

//     Zadeklaruj zmienną tekstową text i przypisz do niej jakąś wartość (Przyjmij ze scannera).
//
//    sprawdź czy w tekście występuje słowo “ania” - contains
//    sprawdź czy tekst zaczyna się od słowa “ania” - startsWith
//    sprawdź czy tekst kończy się słowem “ania” - endsWith
//    sprawdź czy tekst równa się słowu “ania” - equals
//    sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania” - toLowerCase + contains
//    zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście - indexOf


import java.util.Scanner;

public class MainZadanie1 {
    public static void main(String[] args) {
        String tekst = "costam z ania w srodku";

        //a        - można w ten sposób
        if (tekst.contains("ania")) {
            System.out.println("Contains: tekst zawiera słowo");
        } else {
            System.out.println("contains: tekst nie zawiera słowo");
        }

        // b    - i można w taki sposób

        System.out.println("startsWith: " + tekst.startsWith("ania"));

        //c

        System.out.println("endsWith: " + tekst.endsWith("ania"));

        //d

        System.out.println("equals: " + tekst.equals("ania"));

        //e

        System.out.println("toLowerCase contains: " + tekst.toLowerCase().contains("ania"));

        //f
        System.out.println("indexOf: " + tekst.indexOf("ania"));




    }

}
