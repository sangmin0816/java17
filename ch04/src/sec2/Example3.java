package sec2;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        Date today = new Date();
        String data1 = "20230713"; // 문자열
        String data2 = new String("20230713"); // 문자열 객체

        if(data1==data2){
            System.out.println(today);
        }
        else{
            System.out.println("Nope");
        }
        // 문자열과 객체 타입은 값이 같더라도 등호(==)가 아닌 함수(equals)로 비교해야 한다.

        // Nope이 출력된다.
        if(data1.equals(data2)) System.out.println(today); // String 객체의 함수로 비교해야 함
    }
}
