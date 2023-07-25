package sec03;


public class SystemEx1 {
    public static void main(String[] args) {
//        System.setSecurityManager(new SecurityManager(){
//            @Override
//            public void checkExit(int status) {
//                if(status!=5){
//                    throw new SecurityException();
//                }
//            }
//        });
        for(int i=0; i<5; i++){
            System.out.println(i);
            try{
                // 비밀번호 확인 로직
                if(i==3){System.exit(i);}
            } catch(SecurityException e){
                System.out.println("종료");
            }
        }
    }
}
