package sec2;

public class Example1 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i=1; i<=100; i++){
            sum += i;
            // System.out.println("i: "+i+" sum: "+sum);
        }

        System.out.println("total is "+sum);

        int arr[] = new int[10];
        int sum2 = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*10;
            sum2 += arr[i];
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("total is "+sum2);

        int sum3 = 0;
        for(int i=1; i<100; i+=2){
            sum3+=i;
        }
        System.out.println("sum3: "+sum3);
    }
}
