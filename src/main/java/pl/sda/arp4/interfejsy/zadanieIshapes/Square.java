package pl.sda.arp4.interfejsy.zadanieIshapes;

public class Square implements IShapes {
    private double edgeA;

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