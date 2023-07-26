package sec1;
@FunctionalInterface
interface MyLambda2{ // consumer
    void print(int x);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyLambda1 lamb2 = ()->{
            System.out.println("오늘 가산역 사고로 인해 열차가 지연 운행되고 있습니다.");
        };
        lamb2.print();
        MyLambda2 lamb3 = (x)->{
            System.out.println("열차가 "+x+"분 지연될 예정입니다.");
        };
        lamb3.print(10);
    }
}
