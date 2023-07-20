package sec01;

public class GenEx1 {
    public static void main(String[] args) {
        Gen1 g1 = new Gen1();
        g1.setT("38");
        // g1.setT(38); 오류 발생
        System.out.println(g1.getT());

        Gen2 g2 = new Gen2();
        g2.setT(30);
        System.out.println(g2.getT());
        g2.setT("천사");
        System.out.println(g2.getT());

        Gen3 g3 = new Gen3();
        System.out.println(g3.method1());
    }
}
