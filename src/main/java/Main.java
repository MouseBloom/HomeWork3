import java.util.Arrays;

public class Main {

    /*
    Just shows work of classes without throwing any exceptions
     */
    public static void main(String[] args) throws MyExceptionClass {
        try {
            Record r = new Record(1, "1", "V");
            PhoneBook pb = new PhoneBook(r);
            pb.createRecord(new Record(2, "2", "B"));
            pb.createRecord(new Record(3, "3", "Max"));
            pb.deleteRecord(3);
            pb.updateRecord(new Record(1, "8800", "Check"));
            for(Record record: pb.recordsList){
                System.out.println(record.recordInfo());
            }
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

    }
}
