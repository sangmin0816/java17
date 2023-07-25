package sec05;

import java.util.regex.Pattern;

public class PatternEx1 {
    public static void main(String[] args) {
        String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
        String tel1 = "(02)-1004-1234";
        String tel2 = "02-1004-1234";
        String tel3 = "010-1004-1234";
        String tel4 = "(010)-1004-1234";
        String tel5 = "(031)1231004";
        String tel6 = "031123-1004";
        String tel7 = "031-123-1004";

        System.out.println(Pattern.matches(regExp, tel1));
        System.out.println(Pattern.matches(regExp, tel2));
        System.out.println(Pattern.matches(regExp, tel3));
        System.out.println(Pattern.matches(regExp, tel4));
        System.out.println(Pattern.matches(regExp, tel5));
        System.out.println(Pattern.matches(regExp, tel6));
        System.out.println(Pattern.matches(regExp, tel7));
        System.out.println(Pattern.matches(regExp, "010-123-1234"));
        System.out.println("-------------");

        regExp = "\\w+@\\w+\\.\\w*+(\\.\\w+)?";
        regExp = "\\w+@\\w+.\\w*.[a-z]{2,3}$";
        System.out.println(Pattern.matches(regExp, "email@naver.com"));
        System.out.println(Pattern.matches(regExp, "email.naver.com"));
        System.out.println(Pattern.matches(regExp, "email@nate.co.kr"));
        System.out.println(Pattern.matches(regExp, "email.naver.com"));
        System.out.println(Pattern.matches(regExp, "email@naver"));


    }
}
