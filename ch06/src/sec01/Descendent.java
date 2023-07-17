package sec01;

public class Descendent extends Man{

    public void method1() {
        System.out.println("method1 of descendent");
    }

    @Override
    public int method2() {
        return 2;
    }

    @Override
    public void method3(int no) {
        System.out.println("method3 of descendent "+no);
    }

    @Override
    public int method4(int no) {
        System.out.println("method4 of descendent "+no);
        return 0;
    }
}
