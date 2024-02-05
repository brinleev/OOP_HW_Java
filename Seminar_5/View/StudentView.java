package Seminar_5.View;

import java.util.List;

import Seminar_5.Model.Student;

public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> list) {
       for (Student student : list) {
            System.out.println(student);
        }
    }
    
}