package sec1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;


public class Ex7 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(7);
        set1.add(3);
        for(int i=0; i<5; i++){
            set1.add(i);
            System.out.println(Arrays.toString(set1.toArray()));
        }
        Iterator iter = set1.iterator();
        for(int i=0; i<set1.size(); i++){
            System.out.println(iter.next());
        }
    }
}
