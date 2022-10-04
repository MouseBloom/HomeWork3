import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    ArrayList<Record> recordsList = new ArrayList<>();

    PhoneBook(){

    }

    //Getter
    public List<Record> getAllRecords(){
        return recordsList;
    }

    public long getMaxid(){
        long j = 0;
        for(int i=0;i<recordsList.size();i++){
            if(recordsList.get(i).id>j){
                j=recordsList.get(i).id;
            }
        }
        return j;
    }
    public void createRecord(Record record) throws MyExceptionClass{
        for(int i = 0; i<recordsList.size(); i++){
            if(Objects.equals(recordsList.get(i).phoneNumber, record.phoneNumber)){
                throw new MyExceptionClass("Phone Number Already Exists");
            }
            if(Objects.equals(recordsList.get(i).id, record.id)){
                record.id = getMaxid()+1;
            }
        }
        recordsList.add(record);
    }
}
