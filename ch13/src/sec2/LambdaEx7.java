package sec2;
@FunctionalInterface
interface MyLambda7<T, Q>{
    boolean compare(T t, Q q);
}

public class LambdaEx7 {
    public static void main(String[] args) {
        MyLambda7<Integer, Integer> comp1 = (a, b)->{return (a==b)? true:false;};
        System.out.println(comp1.compare(3, 5));
    }
}
