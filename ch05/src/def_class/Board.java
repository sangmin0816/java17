package def_class;

public class Board {
    public static final String DUMMY = "테스트 글 제목";
    // 요러한 상수를 공유데이터라 한다. final과 static의 순서는 관계없다.

    private String title;
    private String content;
    private String resdate;
    private int num;
    private int viewcnt;

    public Board() {
        super();
        // no argument constructor
        // 스프링에서 롬복이 생성해줌
    }

    public Board(String title, String content, String resdate, int num, int viewcnt) {
        super();
        this.title = title;
        this.content = content;
        this.resdate = resdate;
        this.num = num;
        this.viewcnt = viewcnt;
    }
    
    public String getContent() {
        return content;
    }
    public int getNum() {
        return num;
    }
    public String getResdate() {
        return resdate;
    }
    public int getViewcnt() {
        return viewcnt;
    }
    public String getTitle() {
        return title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setResdate(String resdate) {
        this.resdate = resdate;
    }
    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }

    public final static void method1(){
        System.out.println("final static");
    }
    
    public static void method2(){
        System.out.println("static");
    }
    
    public void method3(){
        System.out.println("Board method");
        
    }

    void method4(){
        System.out.println("board method4");
    }

    
}
