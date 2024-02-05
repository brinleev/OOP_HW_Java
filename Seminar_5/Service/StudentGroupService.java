package Seminar_5.Service;

import Seminar_5.Model.Group;
import Seminar_5.Model.Student;
import Seminar_5.Model.Teacher;
import java.util.List;

public class StudentGroupService {
    private  Group group = new Group();
    private int maxGroupId = 0;
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        group.setGroupId(++maxGroupId);
        group.setTeacher(teacher);
        group.setStudentList(studentList);
    }
    public Group getStudentGroup() {
        return group;
    }
}