package sec1;

public class ThreadExample {
    public static void main(String[] args) {
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
