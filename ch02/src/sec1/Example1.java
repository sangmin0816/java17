package sec1;

public class Example1 {
    // 연산자, 피연산자
    public static void main(String[] args) {
        // 연산자: 산술, 대입, 증감, 관계, 논리, 비트, 기타
        // 산술: + - * / %
        // 대입: = += -= *= /=
        // 증감: ++ --
        // 관계: > < >= <= ==

        int a = 20;
        int b = 30;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = b/a;
        int g = b%a;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" float: "+((float)b/a)+" "+g+" ");
    }
}
