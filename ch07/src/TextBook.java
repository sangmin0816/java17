class Outer{
    public Outer() {
    }
    public int a = 1;
    public void outerMethod(){
        System.out.println("Outer method");
    }
    class Inner{
        public Inner() {
        }
        public int a = 2;
        public void innerMethod(){
            System.out.println("Inner method");
        }
        public void innerMethod2(){
            System.out.println(a);
            System.out.println(Outer.this.a);
        }
    }
}

public class TextBook {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.outerMethod(); // Outer method
        Outer.Inner i1 = o1.new Inner();
        i1.innerMethod(); // Inner method
        i1.innerMethod2(); // 2 다음에 1 출력됨
    }
}
