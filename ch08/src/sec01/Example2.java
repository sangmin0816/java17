package sec01;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println(arr[-3]);
        

    }
}
