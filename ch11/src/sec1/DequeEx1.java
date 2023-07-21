package sec1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeEx1 {
    public static void main(String[] args) {
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new LinkedBlockingDeque<>();
        Deque<Integer> dq3 = new ConcurrentLinkedDeque<>();
        Deque<Integer> dq4 = new LinkedList<>();

        for(int i=0; i<5; i++){
            dq1.addFirst(i);
            dq1.addLast(i*2);
        }
        for(Object o: dq1){
            System.out.println(o);
        }
        System.out.println(dq1.removeFirst());

    }
}
