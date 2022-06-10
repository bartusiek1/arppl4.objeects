package pl.sda.arp4.objects.modele;

public class Main {
    public static void main(String[] args) {
        Pies pies1 = new Pies();
        pies1.imie = "Burek";
        System.out.println(pies1);

        Pies pies2 = new Pies();
        pies2.imie = "Wacław";
        System.out.println(pies2);

        Student student1 = new Student("Paweł", "Kowalski");
       // student1.imie =
      //  student1.nazwisko =

        System.out.println(student1);
        System.out.println("Ten studen ma na nazwisko: " + student1.getNazwisko());
        System.out.println();

        student1.przedstawSie();
    }
}