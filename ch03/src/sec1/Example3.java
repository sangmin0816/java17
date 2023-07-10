package sec1;

import java.util.Scanner;

class Example{
    public static void main(String[] args) {
        // 키보드로 학번과 세 과목 점수를 입력받아 총점(tot), 평균(avg), 학점(hak), 판정(pan), 등급(grd) 등을 계산하여 출력하도록 하시오.
        // 총점 = 전산 + PG + OA
        // 평균은 세 과목 점수 합계를 3으로 나눈 실수
        // A+(96), A0(93), A-(90), B(80), C(70), D(60), F(나머지)
        // 판정 = 평균>=80 && 세 과목 다 >>=70 -> 합격
        // 등급은 평균을 20으로 나눈 값으로 5이면 5, 4이면 4...
        // 출력 형식
        // 학번 전산 PG OA 총점 평균, 학점, 판정, 등급

        Scanner sc = new Scanner(System.in);
        

        System.out.print("학번: ");
        String student_id = sc.nextLine();

        System.out.print("전산 점수: ");
        int subject1 = sc.nextInt();

        System.out.print("PG 점수: ");
        int subject2 = sc.nextInt();

        System.out.print("OA 점수: ");
        int subject3 = sc.nextInt();

        int tot = subject1+subject2+subject3;
        float avg = tot/3.0F;
        String hak = "";

        switch((int)avg/10){
            case 10:
            case 9:
                hak += "A";
                break;
            case 8:
                hak += "B";
                break;
            case 7:
                hak += "C";
                break;
            case 6:
                hak += "D";
                break;
            default:
                hak += "F";
        }

        if(avg==100||avg%10>=6) hak+="+";
        else if(avg%10>=3) hak+="0";
        else hak+="-";

        String pan = "합격";
        if(avg<80|(subject1<70||subject2<70||subject3<70)) pan = "불합격";
        
        String grad = "";
        if((int)avg/20>=1) grad += Integer.toString((int) avg/20);
        else grad += "1";
        grad += "등급";

        System.out.println("학번\t전산\tPG\tOA\t총점\t평균\t학점\t판정\t등급");
        System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s", student_id, subject1, subject2, subject3, tot, avg, hak, pan, grad);

        sc.close();

    }
}