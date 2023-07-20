package sec02;

import java.util.List;

public class MultiGen4 {
    public void method1(List<?> lst){
        for(Object li: lst){
            System.out.print(li+" ");
        }
    }

    public int method2(List<? extends Number> lst){
        int sum = 0;
        for(Number n: lst){
            sum += n.doubleValue();
        }
        return sum;
    }

    // Integer의 상위 클래스만 쓸 때는 super
    public List<? super Integer> method3(List<? super Integer> lst){
        for(int i=0; i<5; i++){
            lst.add(i);
        }
        return lst;
    }
}
