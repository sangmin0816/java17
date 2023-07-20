package sec01;

public class Example6 {
    public static void main(String[] args) {
        try{
            Class cls = Class.forName("maria.jdbc.driver");
        } catch (ClassNotFoundException e){
            System.out.println("존재하지 않음");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("원인 불명");
            e.printStackTrace();
        } finally{
            System.out.println("닫기");
        }
    }
}
