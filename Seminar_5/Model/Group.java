package Seminar_5.Model;

import java.util.List;

public class Group {

    private int groupId;
    private Teacher teacher;
    private List<Student> studentList;
    
    public int getGroupId(){
        return groupId;
    }
    public void setGroupId(int groupId){
        this.groupId = groupId;
    }

    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public List<Student> getStudentList(){
        return studentList;
    }
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public String toString(){
        return "Group{" +
            "groupId=" + groupId +
            ", teacher=" + teacher +
            ", studentList=" + studentList +
            '}';
    }
}