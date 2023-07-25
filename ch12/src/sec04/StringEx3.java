package sec04;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("hi 모두들 안녕 내가 누군지 아니");
        sbuffer.replace(0, 2, "hi~");
        System.out.println(sbuffer);

        StringBuilder sbuild = new StringBuilder();
        sbuild.append("hi 바비~ hi 켄~ 두유 워너 파티 투나잇? 숄");
        sbuild.insert(2, "!!");
        System.out.println(sbuild.substring(5, 7));
        String[] sbuildarr = sbuild.toString().split("~");
        System.out.println(Arrays.toString(sbuildarr));
        System.out.println(sbuild.reverse());
    }
}
