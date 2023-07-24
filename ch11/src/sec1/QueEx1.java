package teacher;

import java.util.LinkedList;
import java.util.Queue;

public class QueEx1 {
    public static void main(String[] args) {
        Queue q1 = new LinkedList();
        for(int i=0; i<4; i++){
            q1.add(Math.pow(2, i));
        }
        for(Object o:q1){
            System.out.println(o);
        }
    }
}
