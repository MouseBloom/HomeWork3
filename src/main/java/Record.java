public class Record {
    long id;
    String phoneNumber;
    String Name;

    Record(long id, String phoneNumber, String Name) throws MyExceptionClass {

            this.id = id;
            this.phoneNumber = phoneNumber;
            this.Name = Name;

    }

    Record(){
        throw new MyExceptionClass('Record not valid');
    }

    Record
}



