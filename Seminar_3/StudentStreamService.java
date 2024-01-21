package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentStreamService {
    public List<StudentStream> sortStreamsByGroupSize(List<StudentStream> streams) {
        List<StudentStream> streamList = new ArrayList<>(streams);
        Collections.sort(streamList, new StreamComparator());
        return streamList;
    }
       
}