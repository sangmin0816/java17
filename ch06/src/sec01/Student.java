package sec01;

public class Student {
    private String name;
    private int kor;

    public Student() {
    }

    public void method1(){
        System.out.println("method1 of Class Student");
    }
    public int method2(){
        int a = 1004;
        return a;
    }
    public void method3(int a){
        System.out.println("당신은 "+a);
    }
    public int method4(int a){
        return a*a;
    }
}
