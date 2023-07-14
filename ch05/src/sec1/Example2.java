package sec1;

import def_class.Middle;
import def_class.Score;

public class Example2 {
    public static void main(String[] args) {
        Score el1 = new Score();
        System.out.println(el1.getNum()+" "+el1.getName());
        el1.setNum(1001);
        el1.setName("김일일");
        System.out.println(el1.getNum()+" "+el1.getName());

        Middle mid1 = new Middle();
        mid1.setEng(3);
        mid1.totalNum();
    }
}
