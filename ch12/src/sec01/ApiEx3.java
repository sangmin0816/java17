package sec01;

import java.util.*;

public class ApiEx3 {
    public static void main(String[] args) {
        System.out.println(Math.random()); // 0~1의 실수
        System.out.println((int)(Math.random()*44+1)); // 1~45의 정수

        Set rotto = new HashSet<>();
        while(rotto.size()!=6){
            rotto.add((int)(Math.random()*44+1));
        }
        System.out.print("이번 주 로또 당첨 번호: ");

        Iterator rotto_i = rotto.iterator();
        while(rotto_i.hasNext()){
            System.out.print(rotto_i.next()+" ");
        }

        System.out.println();
        Integer[] lotto = new Integer[6];
        for(int i=0; i<6; i++){
            lotto[i] = (int)(Math.random()*44+1);
//            System.out.println("현재 뽑힌 로또 번호"+Arrays.toString(lotto));
//            for(int j=0; j<i; j++){
//                if(lotto[i]==lotto[j]){
//                    System.out.println((j+1)+"번과 중복됨");
//                    i--;
//                    break;
//                }
//            }
        }

        Set<Integer> lotto_s = new HashSet<>(Arrays.asList(lotto));
        Iterator lotto_si = lotto_s.iterator();
        while(lotto_si.hasNext()){
            System.out.print(lotto_si.next()+" ");
        }
        System.out.println();
        while(lotto_s.size()<6){
            lotto_s.add((int)(Math.random()*44+1));
        }
        lotto = lotto_s.toArray(new Integer[6]);
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
        Arrays.sort(lotto, Collections.reverseOrder());
        System.out.println(Arrays.toString(lotto));
    }
}
