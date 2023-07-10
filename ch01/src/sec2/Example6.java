package sec2;

public class Example6 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0b100; // 이진수
        // 실제 연산과 논리연산 등을 수행
        int c = 0100; // 8진수
        // 권한 부여 및 수행, 회수
        int d = 0x100; // 16진수
        // 실제 물리적 주소(MAC address) 또는 메모리 주소

        System.out.println("a\tb\tc\td");
        System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
    }
}
