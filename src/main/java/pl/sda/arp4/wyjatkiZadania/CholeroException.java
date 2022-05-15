package pl.sda.arp4.wyjatkiZadania;

public class CholeroException extends RuntimeException {

    public CholeroException() {
        super("Pamiętaj chiolero nbigdy nie dziel przez '0'");
    }
}
