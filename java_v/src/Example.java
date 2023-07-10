// 클래스 이름은 대문자로 쓰는 것이 관례입니다.
// .java 파일의 이름은 클래스 이름이 됩니다.
// 자바는 컴파일 되면 .class로 실행 파일이 bin 디렉토리에 생긴다. 이 클래스 파일이 서버에 올라간다. 인텔리 제이 같은 경우 .class는 out 폴더에 생기게 된다. 이클립스도 bin 폴더에!
// 이제 이클립스로 세팅해보기~

public class Example {
    public static void main(String[] args) {
        // psvm을 쓰면 main 함수를 만들어줍니다.
        System.out.println("안녕하세요~ 따옴표 열고 닫고 쓰면 됩니당");
        int x = 99;
        System.out.println("저는 " + x +"년생이에요");
        String example = "나는 소년이오 너는 소녀이다.\nI'm a boy~! you're a girl";
        System.out.println(example);
    }
}