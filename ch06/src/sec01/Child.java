package sec01;

public class Child extends Man{
    // 추상화된 클래스를 상속받는 경우 반드시 추상 메서드를 모두 구현해야 한다.
    @Override
    public void method1() {
        System.out.println("method1 of child");
    }

    @Override
    public int method2() {
        return 2;
    }

    @Override
    public void method3(int no) {
        System.out.println("method3 of child "+no);
    }

    @Override
    public int method4(int no) {
        System.out.println("method4 of child "+no);
        return 0;
    }
}
