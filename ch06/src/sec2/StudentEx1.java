package sec2;

import sec01.Student;

public class StudentEx1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.method1();
        System.out.println(st1.method2());
        st1.method3(1004);
        System.out.println("제곱은 "+st1.method4(1004));
    }
}
