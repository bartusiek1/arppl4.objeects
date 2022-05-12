package strings;

import java.util.Scanner;

public class MainZadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź linię tekstu:");
        String tekst = scanner.nextLine();

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
