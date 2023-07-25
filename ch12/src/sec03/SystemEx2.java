package sec03;

class Student{
    public Student() {
    }

    public int no;
    public String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
public class SystemEx2 {
    public static void main(String[] args) {
        Student st1 = new Student(1, "김일일");
        st1 = null; // 출력도 불가
        st1 = new Student(); // 쓰레기값 들어가 있음. null이 들어감.

        System.gc(); // 가비지 컬렉션
        System.out.println(st1.name+" "+st1.no);
    }
}
