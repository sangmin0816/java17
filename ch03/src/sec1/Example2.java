package sec1;

public class Example2 {
    public static void main(String[] args) {
        int subject1=60,subject2 = 100,subject3 = 100;

        float avg = (subject1+subject2+subject3)/3.0f;

        if(avg>=80) System.out.println("합격입니다");
        else System.out.println("탈락입니다");

        if(subject1>=80 && subject2>=80 && subject3>=80){
            System.out.println("장학금 대상자 입니다");
        }
        else System.out.println("장학금 대상자가 아닙니다");
        
        if(subject1>=80 || subject2>=80 || subject3>=80){
            System.out.println("과목 우수자");
        }
        else System.out.println("과목 우수자가 아닙니다");

        System.out.print(avg+"점은 학점 ");
        if(avg>=90){
            System.out.println("A");
        }
        else if(avg>=80) System.out.println("B");
        else if(avg>=70) System.out.println("C");
        else if(avg>=60) System.out.println("D");
        else System.out.println("F. 제적입니다");

        int grade = (int)avg/10;
        switch(grade){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("판정 불가입니다.");
                break;
            default:
                System.out.println((10-grade)+"등급입니다.");
            
        }

        
    }
}
