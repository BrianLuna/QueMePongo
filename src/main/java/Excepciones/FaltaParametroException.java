package Excepciones;

public class FaltaParametroException extends RuntimeException {

    public FaltaParametroException(String msg){
        super(msg);
    }
}
