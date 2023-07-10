package sec1;

public class Example4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 14;
        int c = -5;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a); // 보수
        System.out.println(a^b);
        System.out.println(~c);
        System.out.println(~a);
        System.out.println(a>>2);
        System.out.println(a<<2);
        System.out.println(a>>>2);
    }
}
