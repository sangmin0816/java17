package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        // byte b2 = -129; 해당 표현 범위보다 작으면 언더플로우
        // byte b3 = 128; 해당 표현 범위보다 크면 오버플로우

        char c1 = 'a';
        // char c2 = -1;
        //char c3 = 65536;

        short s1 = 7;
//        short s2 = -32769;
//        short s3 = 32768;

        long l1 = 1;
//        long l2 = -9223372036854775809;
//        long l3 = 9223372036854775809;

        int i1 = 0;
//        int i2 = -2147483649;
//        int i3 = 2147483648;

        float f1 = 3;
        // float f2 = -1234567890123456789012345678901234567890.0f;
//        float f3 = 1234567890123456789012345678901345678901.0f;

        double d1 = 3.14;
        // double d2 = -12345678901.0;
        // double d2 = 12345678901.0;
    }
}
