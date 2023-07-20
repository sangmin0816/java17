package sec01;

public class Gen2<T> {
    // Type이라면 T, Element라면 E, Key라면 K. Number라면 N, Value라면 V, Result라면 R, Query라면 Q, Generic이라면 G 등과 같이 표기한다.
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Gen2() {
    }

    public void method2(T t){
        System.out.println(t);
    }
}
