package sec01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiEx2_Date {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        String strNow = now.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
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
        Calendar c1 = Calendar.getInstance();
        System.out.print(c1.get(Calendar.YEAR)+" ");
        System.out.print(c1.get(Calendar.MONTH)+1+" "); // 0부터 시작하므로 1 더해주기
        System.out.print(c1.get(Calendar.DATE)+" ");
        System.out.println("\n-------------");
        System.out.println("day of year "+c1.get(Calendar.DAY_OF_YEAR)+" "); // 1년 중 205일
        System.out.println("day of month "+c1.get(Calendar.DAY_OF_MONTH)+" "); // 7월의 24일
        System.out.println("day of week "+c1.get(Calendar.DAY_OF_WEEK)+" "); // 7월 5주차의 2번째 요일인 월요일
        System.out.println("day of week in month "+c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)+" "); // 7월의 4번째 월요일
        System.out.println("week of year "+c1.get(Calendar.WEEK_OF_YEAR)+" "); // 일년 52주 중 30주
        System.out.println("week of month "+c1.get(Calendar.WEEK_OF_MONTH)+" "); // 7월 중 5주
        System.out.println("-------------");
        System.out.print(c1.get(Calendar.HOUR)+" "); // 12시간 체계
        System.out.print(c1.get(Calendar.HOUR_OF_DAY)+" "); // 24시간 체계
        System.out.print(c1.get(Calendar.MINUTE)+" ");
        System.out.print(c1.get(Calendar.SECOND)+" ");
        System.out.print(c1.get(Calendar.AM_PM)+" "); // 오전(0)인지 오후(1)인지
        System.out.println("\n-------------");

        c1.clear(); //1970년 1월 1일로 초기화
        System.out.println(c1.get(Calendar.YEAR)+" "+c1.get(Calendar.MONTH)+1+" "+c1.get(Calendar.DATE));
        c1.set(1999, 7, 16, 13, 28, 39); // month의 경우 -1해서 생각
        System.out.println(c1.getTime());

        c1.set(Calendar.YEAR, 2023);
        c1.set(Calendar.MONTH, 11);
        c1.set(Calendar.DATE,25);
        c1.set(Calendar.HOUR_OF_DAY, 14);
        c1.set(Calendar.MINUTE, 59);
        c1.set(Calendar.SECOND, 15);
        System.out.println(sdf.format(c1.getTime()));
    }
}
