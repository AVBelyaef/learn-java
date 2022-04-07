public class LineException extends Exception {
    char string;

    LineException(String message, char string) {
        super(message);
        this.string = string;
    }

}
