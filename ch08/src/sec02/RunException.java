package sec02;

public class RunException extends Exception{
    public RunException(){}

    public RunException(String msg){
        super(msg+": 사용자 정의 예외");
    }
}
