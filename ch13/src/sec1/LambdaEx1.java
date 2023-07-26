package sec1;

@FunctionalInterface
interface MyLambda1{
    // 추상체 // basic
    void print();
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyLambda1 lamb1 = ()->{
            System.out.println("안녕하세요, 람다식1입니다.");
        };
        lamb1.print();
    }
}

