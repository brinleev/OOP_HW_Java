package Seminar_5.Model;

public class Student extends User {
    private int studentId; 
   
    public int getStudentId() {
        return studentId;
        }
   
    public Student( int studentId, String firstName, String secondName, String lastName){

        super(firstName, secondName, lastName);
        this.studentId = studentId;
    } 

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }    
}