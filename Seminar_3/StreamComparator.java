package Seminar_3;
import java.util.Comparator;

public class StreamComparator implements Comparator<StudentStream> {
    
    @Override
    public int compare(StudentStream a, StudentStream b){
        if (a.getGroupList().size() > b.getGroupList().size())
            return 1;
        if (a.getGroupList().size() < b.getGroupList().size())
            return -1;
        return 0;    
    }

  
}


