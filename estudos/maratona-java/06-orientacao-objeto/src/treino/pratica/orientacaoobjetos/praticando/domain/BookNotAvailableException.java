package treino.pratica.orientacaoobjetos.praticando.domain;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
