package sec01;

public abstract class Man {
    private int item1;
    private int item2;
    public abstract void method1();
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);
    public void method5(){
        System.out.println("method5");
    }
    public int method6(){
        System.out.println("method6");
        return 100;
    }
    public void method7(int no){
        System.out.println("method7");
    }
    public int method8(int no){
        System.out.println("method6");
        return no;}
}
