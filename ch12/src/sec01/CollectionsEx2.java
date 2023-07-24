package sec01;

import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;

public class CollectionsEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 달(month)를 입력하세요: ");
        int month = sc.nextInt()-1;
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, month);
        c1.set(Calendar.DATE, 1);
        for(int i=1; i<c1.get(Calendar.DAY_OF_WEEK); i++){
            System.out.print("\t");
        }
        for(int i=1; i<=c1.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            c1.set(Calendar.DATE, i);
            System.out.print(i+"\t");
            if(c1.get(Calendar.DAY_OF_WEEK)==7) System.out.println(" ");
        }
    }
}
