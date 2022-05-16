package pl.sda.arp4.interfejsy.zadanieIshapes;


// Zadanie IShape (interfejs):
//
//    Napisz interfejs IShape który posiada metody:
//
//    public double calculateArea() - oblicza pole
//    public double calculateCircumference() - oblicza obwód
//
//    Stwórz klasę Circle, Square i Rectangle które powinny posiadać odpowiednią ilość pól. Wszystkie powinny implementować interfejs IShape
//    (napisz obie metody we wszystkich klasach końcowych).
//    Stwórz w mainie (stwórz oddzielną klasę Main) pętlę parsującą komendy. Dopuszczalne komendy to:
//
//    square
//    rectangle
//    circle
//
//    Po wpisaniu kształtu poproś użytkownika o podanie:
//
//    1 parametru dla Square i Circle
//    2 parametrów dla Rectangle
//
//    Oblicz i wypisz pole i obwód kształtu na ekran.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select shape: (square, circle, rectangle)");
        String shapeName = scanner.next();

        if (shapeName.equalsIgnoreCase("circle")) {
            System.out.println("Please provide radius:");
       yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy     double inputRadius = scanner.nextDouble();

            Circle circle = new Circle(inputRadius);
            System.out.println("Area          is : " + circle.calculateArea());
            System.out.println("Circumference is : " + circle.calculateCircumference());
        } else if (shapeName.equalsIgnoreCase("square")) {
            System.out.println("Please provide length of the edge:");
            double inputEdge = scanner.nextDouble();

            Square square = new Square(inputEdge);
            System.out.println("Area          is : " + square.calculateArea());
            System.out.println("Circumference is : " + square.calculateCircumference());
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            System.out.println("Please provide length of the edge A:");    private double edgeA;

    public Square(double edgeA) {
                this.edgeA = edgeA;
            }

            @Override
            public double calculateArea() {
                return edgeA * edgeA;
            }

            @Override
            public double calculateCircumference() {
                return edgeA * 4;
            }
        }
            double inputEdgeA = scanner.nextDouble();
            System.out.println("Please provide length of the edge B:");
            double inputEdgeB = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(inputEdgeA, inputEdgeB);
            System.out.println("Area          is : " + rectangle.calculateArea());
            System.out.println("Circumference is : " + rectangle.calculateCircumference());
        } else {
            System.err.println("Provided shape can't be calculated.");
        }
    }
}
