public class MyExceptionClass extends Exception {
    private int detail;

    MyExceptionClass(int detail, String message) {
        super(message);
        this.detail = detail;

    }



    public MyExceptionClass(String recordNotValid) {
        super(recordNotValid);
    }
}
