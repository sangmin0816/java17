package sec03;

public class SystemEx3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // 1000분의 1초
        start = System.nanoTime(); // 1/1000000000초 반환. 성능 측정 목적
        long tot = 0;
        for(long i=0; i<2000000000; i++){
            tot+=i;
        }
        long end = System.nanoTime();
        long time = end-start;
        System.out.println("total: "+tot+"   "+time+" ns  "+(time/1000000000)+"초");
    }
}
