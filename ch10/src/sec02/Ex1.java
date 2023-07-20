package sec02;

class Subclass{
    public String name;

    public Subclass() {
    }
}
public class Ex1 {
    public static void main(String[] args) {
        MultiGen1 m1 = new MultiGen1<Subclass, Integer>();
        System.out.println(m1.setValue(30));
        System.out.println(m1.getValue());

        MultiGen2 m2 = new MultiGen2<String, Integer>();
        m2.setName("일일");
        m2.setAge(20);
        MultiGen2 m3 = new MultiGen2<String, Integer>();
        m3.setName("일이");
        m3.setAge(20);

        System.out.println(MultiGen2.compare(m2, m3));
    }
}
