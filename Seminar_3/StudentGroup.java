package Seminar_3;

public class StudentGroup implements Comparable<StudentGroup> {

    private int numberofStudentGroup;
    private String studentGroupName;

    public StudentGroup(String studentGroupName, int numberofStudentGroup){
            this.studentGroupName = studentGroupName;
            this.numberofStudentGroup = numberofStudentGroup;
    }

    public int getNumberofStudentGroup() {
        return numberofStudentGroup;
    }

    public void setNumberofStudentGroup(int numberofStudentGroup) {
        this.numberofStudentGroup = numberofStudentGroup;
    }
   
    public String getStudentGroupName() {
        return studentGroupName;
    }

    public void setStudentGroupName(String studentGroupName) {
        this.studentGroupName = studentGroupName;
    }

    @Override
    public String toString() {
        return "StudentGroup number - " + numberofStudentGroup + ", name - " + studentGroupName;
    }

    @Override
    public int compareTo(StudentGroup o) {
        if(numberofStudentGroup > o.getNumberofStudentGroup())
            return 1;
        if(numberofStudentGroup < o.getNumberofStudentGroup())
            return -1;
        return 0;
    }

}
