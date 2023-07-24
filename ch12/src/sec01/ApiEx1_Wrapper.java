package sec01;

public class ApiEx1_Wrapper {
    public static void main(String[] args) {
        int a = 1004;
        Integer b = 1004;
        int a1 = b; // Unboxing
        Integer b1 = a;
        System.out.println(a+" "+b+" "+a1+" "+b1);

        String val1 = "1004";
        boolean res = isInteger(val1);
        System.out.println("스트링을 int로 변환 가능한가? "+res);
        if(res){
            int val2 = Integer.parseInt(val1);
            System.out.println(val2);
        }

        String val3 = "365.24781";
        res = isDouble(val3);
        System.out.println("스트링을 double로 변환 가능한가? "+res);
        if(res){
            double val4 = Double.parseDouble(val3);
            System.out.println(val4);
        }
    }
    public static boolean isInteger(String val1){
        try{
            Integer.parseInt(val1);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    public static boolean isDouble(String val1){
        try{
            Double.parseDouble(val1);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
