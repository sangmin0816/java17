package sec2;

public class Run2 {
    public static void main(String[] args) {
        Thread curT = Thread.currentThread();
        System.out.println(curT.getState());
        System.out.println("현재 동작 중인 쓰레드 이름: "+curT.getName());
        System.out.println(curT.activeCount());
    }
}
