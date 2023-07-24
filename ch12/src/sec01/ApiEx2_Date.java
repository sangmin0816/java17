package sec01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApiEx2_Date {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        String strNow = now.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//        String today1 = sdf.format(strNow); java 8 미만은 오류
        String today2 = sdf.format(now); // java 8 이상부터 가능해짐
        System.out.println(strNow);
        System.out.println(now);

        int y = 1900 + now.getYear(); //1900년도부터 시작
        int m = 1 + now.getMonth(); // 0월부터 시작
        int d = now.getDate(); // 며칠인가
        // get.Day()는 요일
        int h = now.getHours();
        int mm = now.getMinutes();
        int s = now.getSeconds();
        System.out.println(y+" "+m+" "+d+" "+h+" "+mm+" "+s);

        // Java 8 이후 LocaleDate를 활용하여 시간대나 지역의 지역성을 나타냄

    }
}
