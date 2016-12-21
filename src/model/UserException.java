package model;

/**
 * Created by double on 16-12-21.
 */
public class UserException extends RuntimeException {

    public UserException(){
        super();
    }

    public UserException(String message,Throwable cause){
        super(message,cause);
    }
    public UserException(String message){
        super(message);
    }
    public UserException(Throwable causer){
        super(causer);
    }

}
