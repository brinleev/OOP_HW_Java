package Seminar_3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class StudentStream implements Iterable<StudentGroup>{

    private List<StudentGroup> groupList;
    private int streamNumber;

    public StudentStream(int streamNumber, List<StudentGroup> groupList){
        this.groupList =  new ArrayList<StudentGroup>();
        this.streamNumber = streamNumber;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }
    
    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    public void addStudentGroup(StudentGroup studentGroup){
        groupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
       return new StudentStreamIterator(this);
    }

    @Override
    public String toString() {
        return "StudentStream №" + streamNumber + ":" +groupList ;
    }

}

