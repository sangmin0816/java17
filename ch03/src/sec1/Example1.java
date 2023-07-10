package sec1;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        System.out.println("키를 입력하세요");
        double height = sc.nextDouble();

        System.out.println("안녕하세요. "+name+"님");
        if(age>=36){
            System.out.println("당신은 중년이상");
            System.out.println("엣");
        }
        if(height<=180){
            System.out.println("키가 작으시군요!");
        }


        sc.close();
    }
}
