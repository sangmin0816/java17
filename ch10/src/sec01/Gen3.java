package sec01;


interface InterGen3<T>{
    T method1(); // 반환 타입을 범용화 할 경우 interface 사용
}
public class Gen3 implements InterGen3<Integer>{
    @Override
    public Integer method1() {
        return 30;
    }

    public Gen3() {
    }
}
