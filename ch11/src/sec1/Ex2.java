package sec1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ex2 {
    public static void main(String[] args) {
        List<Object> lst1 = new ArrayList<>();
        lst1 = new Vector<>();
        lst1 = new LinkedList<>();

        ArrayList lst2 = new ArrayList<>();
        listMethod(lst2);
    }

    public static void listMethod(List ls) {
    }

    public static void listMethod2(ArrayList ls){
    }
}

