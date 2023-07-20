package sec2;

import java.sql.Time;

class SBRunnable implements Runnable{
    public void run(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0; i<5; i++){
            System.out.println("1: "+(500+i*1000));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SCRunaable implements Runnable{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0; i<5; i++){
            System.out.println("2: "+(1000+i*500));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Run1 {
    public static void main(String[] args) {
        Runnable sbRun1 = new SBRunnable();
        Thread t1 = new Thread(sbRun1);
        t1.start();
        Thread t2 = new Thread(new SCRunaable());
        t2.start();
    }
}
