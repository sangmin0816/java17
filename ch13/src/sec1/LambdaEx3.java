package sec1;
@FunctionalInterface
interface MyLambda3{
    String print(); // supplier
}
public class LambdaEx3 {
    public static void main(String[] args) {
        MyLambda3 lamb3 = ()->{
            return "Hi Barbie~";
        };

        System.out.println(lamb3.print());
    }
}
