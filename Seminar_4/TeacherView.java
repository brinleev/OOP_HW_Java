package Seminar_4;

import java.util.List;

public class TeacherView extends TeacherService implements UserView<Teacher> {

    @Override
    public void sendOnConcole(List<Teacher> list) {
      for (Teacher teacher: list) {
        System.out.println(teacher);
      }
    }

    public void sendOnConsole(List<Teacher> all) {
        for (Teacher teacher: all) {
            System.out.println(teacher);
          }
    
}
}