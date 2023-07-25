package sec05;

import java.util.Arrays;

public class ArrEx1 {
    public static void main(String[] args) {
        char[] carr = "KimJAVA".toCharArray();
        System.out.println(carr);
        char[] carr2 = carr; // 얕은 복사. 같은 주소를 배정. carr2를 바꾸면 carr도 바뀜
        System.out.println(carr==carr2);
        System.out.println(carr.hashCode()+" "+carr2.hashCode());
        carr2[0] = 'C';
        System.out.println(carr);
        System.out.println(carr2);
        System.out.println(Arrays.equals(carr, carr2));

        char[] carr3 = Arrays.copyOf(carr, carr.length); // 깊은 복사
        carr3[0] = 'J';
        System.out.println(carr.hashCode()+" "+carr3.hashCode());
        System.out.println(carr3);
        System.out.println(carr);
        Arrays.sort(carr3);
        System.out.println(Arrays.toString(carr3));

        System.out.println(Arrays.binarySearch(carr, 'C')); // 없으면 음수 값 출력
    }
}
