package Seminar_5.View;

import java.util.List;

import Seminar_5.Model.Teacher;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
    
}