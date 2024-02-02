package Seminar_4;

import java.util.List;

public class TeacherControler extends TeacherService  implements UserControler<Teacher> {

    private TeacherService teacherService = new TeacherService();
    private TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }
    
    public void editTeacher(int teacherId, String firstName,String secondName, String lastName){
        teacherService.editTeacher(teacherId,firstName,secondName,lastName);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherView.getAll());
    }
}