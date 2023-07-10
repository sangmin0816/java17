package sec1;

public class Example4 {
    public static void main(String[] args) {
        // 참조형 변수 통해 각 기본 변수의 최소값과 최대값 출력
        System.out.print("Byte: ");
        System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.print("Char: ");
        System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
        System.out.print("Short: ");
        System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        System.out.print("Long: ");
        System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);

        System.out.print("Intenger: ");
        System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        System.out.print("Float: ");
        System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
        System.out.print("Double: ");
        System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
    }
}
