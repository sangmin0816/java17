package sec02;

public class MultiGen2 <T, M>{
    public MultiGen2() {
    }

    private T name;
    private M age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }

    public static <T, V> boolean compare(MultiGen2<T, V> m1, MultiGen2<T, V> m2){
        return m1.getName().equals(m2.getName()) && m2.getAge().equals(m2.getAge());
    }
}
