package exception;

public class DoluKoltukException extends Exception{
    /*
    Dolu bir koltuk istenince fırlatır
     */
    public DoluKoltukException(String mesaj)
    {
        super(mesaj);
    }
}
