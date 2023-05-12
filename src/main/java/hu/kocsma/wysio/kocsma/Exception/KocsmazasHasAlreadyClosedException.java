package hu.kocsma.wysio.kocsma.Exception;

public class KocsmazasHasAlreadyClosedException extends RuntimeException{
    public KocsmazasHasAlreadyClosedException(String message) {
        super(message);
    }
}
