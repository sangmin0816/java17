package sec1;

public class Example3 {
    public static void main(String[] args) {
        // 관계 연산: == < > <= >= !=
        System.out.println("대입 연산자");
        int su1 = 90;
        int su2 = 85;
        int su3 = 88;
        System.out.println(su1==su2);
        System.out.println(su1!=su2);
        System.out.println(su1>su2);
        System.out.println(su2>=su3);
        System.out.println(su1<su2);
        System.out.println(su1<=su2);
        
        System.out.println("논리 연산자");
        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(bo1&&bo2);
        System.out.println(bo1||bo2);
        System.out.println(bo1^bo2);
        System.out.println(!bo2);
    }
}
