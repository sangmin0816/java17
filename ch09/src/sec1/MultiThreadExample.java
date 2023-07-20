package sec1;

class SMThread extends Thread{
    public synchronized void start(){
        super.start();
        this.method1();
    }

    public SMThread() {
    }

    public void method1(){
        for(int i=1; i<7; i++){
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void run(){
        int[] arr = new int[6];
        int temp = 95;
        for(int i=0; i<arr.length; i++){
            arr[i] = temp-5*i;
            System.out.println(arr[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread th1 = new SMThread();
        th1.start();

    }
}
