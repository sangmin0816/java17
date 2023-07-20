package sec02;

public class ThrowExample {
    public static void main(String[] args) throws Exception{
        String name = null;
        nullCheck(name);

        int[] arr = new int[4];
        //arrayCheck(arr);

        String data = "1004천사";
        //dataCheck(data);

    }
    public static void nullCheck(String name) throws NullPointerException{
        System.out.println(name); // 예외 상황이 되었을 경우 NullPointerException이 처리하게 된다.
        // 강제 예외 전가라 할 수 있다.
    }
    public static void arrayCheck(int[] arri) throws ArrayIndexOutOfBoundsException{
        System.out.println(arri[4]);
    }
    public static void dataCheck(String a) throws NullPointerException, NumberFormatException{
        System.out.println(Integer.parseInt(a));
    }
}
