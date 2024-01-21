package Seminar_3;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup>{
    private List<StudentGroup> studentGroup;
    private int counter;

    public StudentStreamIterator(StudentStream studentStream){
        this.studentGroup = studentStream.getGroupList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroup.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){
            return studentGroup.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentGroup.remove(counter);
    }
}
