package SecondQn;

public class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void causeError() {
        // Simulate a cause of an error
        throw new IllegalArgumentException("This is the root cause");
    }

    public static void main(String[] args){
        System.out.println("Second Question: " );

        try {
            // Simulate an error
            causeError();
        } catch (Exception e) {
            // Wrap the caught exception in a CustomUncheckedException
            throw new SecondQn.CustomUncheckedException("Something went wrong", e);
        }
    }
}


