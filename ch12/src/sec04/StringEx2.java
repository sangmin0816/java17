package sec04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringEx2 {
    public static void main(String[] args) {
        String man1 = "abc/deg/fdfkj/skjfljsd/skjdflj";
        String[] sarr = man1.split("/");
        System.out.println(Arrays.toString(sarr));
        String man2 = "&&&abc/deg/fdfkj,skjfljsd,skjdflj";
        String[] sarr2 = man2.split("/|,|&");
        System.out.println(Arrays.toString(sarr2));

        StringTokenizer tk1 = new StringTokenizer(man2, "/|,");
        int cnt = tk1.countTokens();
        for(int i=0; i<cnt; i++){
            String token = tk1.nextToken();
            System.out.print(token+" ");
        }
        System.out.println(cnt);
    }
}
