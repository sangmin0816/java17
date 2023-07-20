class Outer{
    public Outer() {
    }

    public void outerMethod(){
        System.out.println("Outer method");
    }
    class Inner{
        public Inner() {
        }
        public void innerMethod(){
            System.out.println("Inner method");
        }
    }
}

public class TextBook {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.outerMethod(); // Outer method
        Outer.Inner i1 = o1.new Inner();
        i1.innerMethod(); // Inner method
    }
}
