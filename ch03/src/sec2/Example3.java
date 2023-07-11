package sec2;

public class Example3 {
    public static void main(String[] args) {
        int i=0, sum=0;
        do{
            i++;
            sum+=i;
        } while(i>100);

        System.out.println("do-while sum: "+sum);
        
        i=0; sum=0;
        while(i>100){
            i++;
            sum+=i;
        }
        System.out.println("while sum: "+sum);
    }
}
