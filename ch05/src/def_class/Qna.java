package def_class;

public class Qna extends Board {
    // 계층형 QnA 게시판
    private int level; // 0은 문의글, 1은 답글, 2는 답글에 대한 질문, 3는 답글의 질문의 답글
    private int parentNum;

    public Qna() {
        super();
    }
    public Qna(String title, String content, String resdate, int num, int viewcnt) {
        super(title, content, resdate, num, viewcnt);
    }

    public int getLevel() {
        return level;
    }
    public int getParentNum() {
        return parentNum;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setParentNum(int parentNum) {
        this.parentNum = parentNum;
    }

    public static void method2(){
        System.out.println("Qna static");
    }

    @Override
    public void method3(){
        
        System.out.println("Qna method");
    }

    public void method4(){
        System.out.println("qna method4");
    }

}