package play.exception;

public class CannotCalculate extends RuntimeException{
    public CannotCalculate (String message){
        super(message);
    }
}
