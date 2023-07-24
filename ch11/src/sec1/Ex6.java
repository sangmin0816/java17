package teacher;

import java.util.LinkedList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Student> sList= new LinkedList<>();
        for(int i=1; i<6; i++){
            sList.add(new Student(i, "name"+i, i*10));
        }
        for(Student s: sList){
            System.out.println(s.sno+" "+s.sname+" "+s.point);
        }
    }
}
