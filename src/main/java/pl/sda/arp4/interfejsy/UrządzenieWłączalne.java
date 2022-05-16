package pl.sda.arp4.interfejsy;

public interface UrządzenieWłączalne {
    public static final int NAPIECIE_ZASILANIA_V = 230;
    /**
     * Interfejs to typ, który posiada tylko metody 'public abstract'
     * BEZ IMPLEMENTACJI
     *
     * Interfejs jest z definicji abstrakcyjny/niekompletny - nie możemy stworzyć instancji
     *
     * Interfejs posida metody, ale nie może posiadać pól
     * zdefiniowane w klasie pola są stałymi globalnymi 'public static final'
     *
     * Interfejs używamy w dwóch przypadkach (przewaznie nie jednocześnie)
     *  - cel 1: do dewfiniowania stałych (w tym przypadku raczej nie używamy dziedziczenia)
     *  - cel 2: do definiowania wspólnego zachowania
     *
     *  Klasy abstrakcyjne piszemy, kiedy mamy wspólne cechy/pola do dziedziczenia
     *  Interfejsy piszemy kiedy mamy wspłlne zachowania do dziedziczenia (brak pól)
     *
     *  Możemy dziecziczyć po jednej klasie, a implementować nieskończenie wiele interfejsów
     */

    public abstract void wlacz();

}
