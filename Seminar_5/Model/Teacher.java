package Seminar_5.Model;

public class Teacher extends User{
    private int teacherId; 
   
    public int getTeacherId() {
        return teacherId;
        }
   
    public Teacher( int teacherId, String firstName, String secondName, String lastName){

        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    } 

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }    
}