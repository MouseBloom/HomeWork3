public class Record {
    long id;
    String phoneNumber;
    String Name;

    Record(long id, String phoneNumber, String Name) throws MyExceptionClass {

            this.id = id;
            this.phoneNumber = phoneNumber;
            this.Name = Name;

    }

    Record() throws MyExceptionClass{
        throw new MyExceptionClass("Record not valid");
    }

    Record(long id) throws MyExceptionClass{
        throw new MyExceptionClass("Record not valid");
    }

    Record(long id, String pn) throws MyExceptionClass{
        throw new MyExceptionClass("Record not valid");
    }
}



