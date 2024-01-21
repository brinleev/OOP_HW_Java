package Seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup_1 = new StudentGroup("ПМ",1);
        StudentGroup studentGroup_2 = new StudentGroup("ПТ",2);
        StudentGroup studentGroup_3 = new StudentGroup("ХМ",3);
        StudentGroup studentGroup_4 = new StudentGroup("ЭМ",4);
        StudentGroup studentGroup_5 = new StudentGroup("ЭП",5);
        StudentGroup studentGroup_6 = new StudentGroup("АТ",6);
       
        List<StudentGroup> groupAllList = new ArrayList<>();
        groupAllList.add(studentGroup_1);
        groupAllList.add(studentGroup_2);
        groupAllList.add(studentGroup_3);
        groupAllList.add(studentGroup_4);
        groupAllList.add(studentGroup_5);
        groupAllList.add(studentGroup_6);
       
        List<StudentGroup> groupList = new ArrayList<>();

        StudentStream stream_1 = new StudentStream(1, groupList);
        stream_1.addStudentGroup(studentGroup_1);
        stream_1.addStudentGroup(studentGroup_2);
        stream_1.addStudentGroup(studentGroup_3);

        StudentStream stream_2 = new StudentStream(2, groupList);

        stream_2.addStudentGroup(studentGroup_4);
        stream_2.addStudentGroup(studentGroup_5);
        
        StudentStream stream_3 = new StudentStream(3, groupList);

        stream_3.addStudentGroup(studentGroup_6);


        java.util.Iterator<StudentGroup> iterator = groupAllList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

         List<StudentStream> streams = List.of(stream_3, stream_1, stream_2);
             
        System.out.println();
        StudentStreamService service = new StudentStreamService();
        for (StudentStream studentStream : service.sortStreamsByGroupSize(streams)) {
            System.out.println(studentStream);
        }
       
    }
}