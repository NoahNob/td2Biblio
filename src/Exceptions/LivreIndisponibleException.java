package Exceptions;

public class LivreIndisponibleException extends RuntimeException {
    public LivreIndisponibleException(String message) {
        super("Livre indisponible:" + message);
    }
}
