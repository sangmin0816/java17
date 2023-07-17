package sec2;

abstract class AbstractParent{
    abstract void hello();
}

class Child1 extends AbstractParent{
    @Override
    void hello() {
        System.out.println("Hello Child1");
    }
}

class Child2 extends AbstractParent{
    @Override
    void hello() {
        System.out.println("Hello Child2");
    }
}

public class Textbook {
    public static void main(String[] args) {
        AbstractParent ap = new Child1();
        ap.hello(); // Hello. Child1
        ap = new Child2();
        ap.hello(); // Hello. Child2
        AbstractParent ap2 = new AbstractParent() {
            @Override
            void hello() {
                System.out.println("Hello AbstractParent");
            }
        };
        ap2.hello(); // Hello AbstractParent

    }
}
