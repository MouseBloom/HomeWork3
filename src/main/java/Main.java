public class Main {
    public static void main(String[] args) throws MyExceptionClass {
        try {
            Record r = new Record(1, "1", "V");
            PhoneBook pb = new PhoneBook(r);
            pb.createRecord(new Record(2, "2", "B"));
            pb.updateRecord(new Record(2, "913", "Max"));
            pb.deleteRecord(3);
            System.out.println(pb.recordsList.get(1).id);
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

    }
}
