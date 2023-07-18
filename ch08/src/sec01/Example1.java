package sec01;

public class Example1 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2= 0;

        try{
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num1/num2);

        }  catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        } finally{
            System.out.println("실행 종료");
        }
    }
}
