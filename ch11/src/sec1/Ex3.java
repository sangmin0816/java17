package teacher;

import java.util.ArrayList;
import java.util.List;

class Student{
    public int sno=3;
    public String sname="Kim";
    public int point=50;

    public Student() {
    }

    public Student(int sno, String sname, int point) {
        this.sno = sno;
        this.sname = sname;
        this.point = point;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        List<String> ls1 = new ArrayList<>();
        ls1.add("no");
        ls1.add("yes");
        ls1.add("however"); // 요소 입력
        ls1.remove(2); // 특정 요소 제거
        ls1.clear(); // 모든 요소 제거
        ls1.add("me");
        ls1.addAll(ls1);
        ls1.isEmpty();
        System.out.println(ls1.get(1));
        System.out.println(ls1.size());
        System.out.println(ls1.contains("out"));
        ls1.lastIndexOf("me");
        System.out.println(ls1);
        for(String s: ls1){
            System.out.println(s);
        }

        List<Student> sli = new ArrayList<>();
        Student s1 = new Student();
        sli.add(s1);
        for(Student s: sli){
            System.out.println(s.sno);
        }
    }
}
