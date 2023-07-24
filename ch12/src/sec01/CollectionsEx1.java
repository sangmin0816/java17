package sec01;

public class CollectionsEx1 {
    public static void main(String[] args) {
        Week[] wk = Week.values();
        for(Week w: wk){
            System.out.print(w.ordinal()+" "); // 인덱스 번호, 순서
            System.out.print(w.name()+" "); // 저장된 이름
            System.out.print(w.korean+" ");
            System.out.println(w.chinese);
        }
    }
}
