package sec02;

import sec01.*;

public class Example2 {
    public static void main(String[] args) {
        Outer out1 = new Outer();
        out1.setItem1(100);
        out1.setItem2("hello");
        out1.method1();
        Outer.Inner in1 = out1.new Inner();
        in1.method2();
        out1.dblMethod();

    }
}
