package sec1;

public class Example2 {
    public static void main(String[] args) {
        // 대입: = += -= *= /=
        int su = 0;
        su+=10;
        System.out.println(su);
        su-=5;
        System.out.println(su);
        su*=10;
        System.out.println(su);
        float su_f = (float)su/4;
        su/=4;
        System.out.println(su + " float " +su_f);

        // 증감: ++ --
        int a = 10, b = 10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--b);
        System.out.println(b);
    }
}
