public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
        System.out.println("ACCESO DNEGADO DESDE LA  CLASE");
    }
}
