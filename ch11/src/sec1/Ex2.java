package sec1;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        List<Object> lst1 = new ArrayList<>();
        lst1 = new Vector<>();
        lst1 = new LinkedList<>();

        ArrayList lst2 = new ArrayList<>();
        listMethod(lst2);

        List<Integer> aList1 = Arrays.asList(1, 2, 3, 4);
        aList1.set(1, 7);
        System.out.println(aList1.toString()); // [1, 7, 3, 4]

        List<Integer> aList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        aList2.add(5);
        System.out.println(aList2.toString()); // [1, 2, 3, 4, 5]
    }

    public static void listMethod(List ls) {
    }

    public static void listMethod2(ArrayList ls){
    }

}

