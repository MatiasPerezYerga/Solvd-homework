public class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){

        super(message);
        System.out.println("Only employees from 18 to 55 years old are allowed.");
    }
}
