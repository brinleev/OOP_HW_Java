package Seminar_5.Controller;

import java.util.ArrayList;
import java.util.List;

import Seminar_5.Model.Student;
import Seminar_5.Model.Teacher;
import Seminar_5.Model.Type;
import Seminar_5.Service.DataService;
import Seminar_5.Service.StudentGroupService;
import Seminar_5.View.GroupView;
import Seminar_5.View.StudentView;
import Seminar_5.View.TeacherView;

public class Controller {
     private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final GroupView studentGroupView = new GroupView();
    public void createStudent(String firstname, String secondname, String lastname){
        dataService.create(Type.STUDENT,firstname,firstname,lastname);
    }
    public void createTeacher(String firstname, String secondname, String lastname){
        dataService.create(Type.TEACHER,firstname,secondname,lastname);
    }
    public void getAllStudents(){
        studentView.sendOnConsole(dataService.getAllStudents());
    }
    public void getAllTeachers(){
        teacherView.sendOnConsole(dataService.getAllTeachers());
    }
    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList){
        Teacher teacher = (Teacher) dataService.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id:studentIdList) {
            studentList.add((Student) dataService.getUserById(Type.STUDENT, id));
        }
        studentGroupService.createStudentGroup(teacher,studentList);
    }
    public void printStudentGroup(){
        studentGroupView.sendOnConsole(studentGroupService.getStudentGroup());
    }
}