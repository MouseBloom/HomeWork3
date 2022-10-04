public class Main {
    public static void main(String[] args) {
        try {
            Record r = new Record();
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

    }
}
