package sec02;

public class UserExceptionEx1 {
    public static void methodException() throws RunException{
        throw new RunException("사용자 정의 실행 예외");
    }
    public static void main(String[] args) {
        try{
            methodException();
        } catch(RunException e){
            e.getMessage(); // 웹에서만 메시지를 볼 수 있음
            e.printStackTrace(); // IDE 콘솔창에서 확인 가능
        }
    }
}