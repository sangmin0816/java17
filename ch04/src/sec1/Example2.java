package sec1;

public class Example2 {
    public static void main(String[] args) {
        int[] c = new int[4];
        for(int i=0; i<c.length; i++){
            c[i] = 100;
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for(int i:c){
            System.out.print(i+" ");
        }
    }
}
