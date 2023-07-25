package sec03;

import java.util.Properties;
import java.util.Set;

public class SystemEx4 {
    public static void main(String[] args) {
        System.out.println(System.getenv("path")); // 환경변수
        System.out.println(System.getProperty("os.name")); // 운영체제 이름
        System.out.println(System.getProperty("user.name")); // 유저 이름
        System.out.println(System.getProperty("user.home")); // 유저의 디렉토리
        System.out.println(System.getProperty("java.version")); // 자바 버전
        System.out.println(System.getProperty("java.home")); // 환경변수 자바 path
        Properties props = System.getProperties();

        Set props_keys = props.keySet();
        for(Object o:props_keys){
            String key = (String)o;
            String val = System.getProperty(key);
            System.out.println(key+" "+val);
        }
    }
}
