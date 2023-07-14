package sec1;

import def_class.Board;
import def_class.Qna;

public class Example4 {
    public static void main(String[] args) {
        Qna q1 = new Qna();
        q1.setTitle(Qna.DUMMY);
        System.out.println(q1.getTitle());
        Qna q2 = new Qna();
        q2.setTitle(q2.DUMMY);
        System.out.println(q2.getTitle());
        q2.method4();

        Board bq = new Qna();
        bq.method2();
        q2.method2();
        bq.method3();

    }   
}
