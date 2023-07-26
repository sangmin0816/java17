package sec1;
@FunctionalInterface
interface MyLabmda4{
    String print(int x);
}

interface MyLambda5{
    int print(int x);
}

interface MyLambda6{
    boolean print(int x);
}
public class LambdaEx4 {
    public static void main(String[] args) {
        MyLabmda4 lamb1 = x -> {
            String y = "초콜렛 " + x + "개를 받으셨습니다.";
            return y; // Function
        };
        System.out.println(lamb1.print(50));

        MyLambda5 lamb2 = x->{
            return (x+30); // Operator
        };
        System.out.println(lamb2.print(20));

        MyLambda6 lamb3 = x -> {
            return (x>50); // Predicate
        };
        System.out.println(lamb3.print(49));
    }
}
