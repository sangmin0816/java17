package sec04;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = new String(" I Love You ");
        System.out.println(str1.charAt(4));
        System.out.println(str1.equals("You Love me"));

        byte[] barr = str1.getBytes(); // 문자열을 바이트 배열로 분리
        printArr1(barr);
        printArr2(barr);
        System.out.println(Arrays.toString(barr));

        char[] carr = str1.toCharArray(); // 문자열을 문자 배열로 분리
        System.out.println(Arrays.toString(carr));

        System.out.println(str1.indexOf('I'));
        System.out.println(str1.lastIndexOf(' '));
        System.out.println(str1.substring(3, 6));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        System.out.println(str1.replace(' ', 'X'));
        System.out.println(str1.trim().length());

        int k = 1004;
        Integer k2 = 1004;
        // String ks = (String)1004; 강제 형변환 불가
        String ks = k+""; // 사용 지양.
        System.out.println(Integer.toString(1004));
        System.out.println(String.valueOf(1004));
        System.out.println(ks instanceof String);
        System.out.println(k2 instanceof Integer);
    }
    static void printArr1(byte[] barr){
        for(byte b: barr){
            System.out.print((char)b+" ");
        }
        System.out.println();
    }
    static void printArr2(byte[] barr){
        for(int i=0; i<barr.length; i++){
            System.out.print(barr[i]+" ");
        }
        System.out.println();
    }
}
