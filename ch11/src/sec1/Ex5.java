package sec1;

import java.util.List;
import java.util.Vector;

class Qna{
    public Qna() {
    }
    public int qno;
    public String title;
    public String content;

    public Qna(int qno, String title, String content) {
        this.qno = qno;
        this.title = title;
        this.content = content;
    }
}
public class Ex5 {
    public static void main(String[] args) {
        List<Qna> q = new Vector<>();
        for(int i=1; i<=5; i++){
            q.add(new Qna(i, "title"+i, "content"+i));
        }
        for(Qna i: q){
            System.out.println(i.qno+" "+ i.title+" "+i.content);
        }
    }
}
