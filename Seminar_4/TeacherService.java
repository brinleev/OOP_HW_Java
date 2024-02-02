package Seminar_4;

import java.util.List;

public class TeacherService implements UserService<Teacher>{
    
    private List<Teacher> teacherList;
    private int maxTeacherId = 0;

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(++maxTeacherId,firstName, secondName, lastName);
        teacherList.add(teacher);
    }
    public void editTeacher(int teacherId, String firstName, String secondName, String lastName){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId()==teacherId){
                teacher.setFirstName(firstName);
                teacher.setSecondName(secondName);
                teacher.setLastName(lastName);
            }
        }
    }
    private Integer getNewMaxTeacherId(){
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}