package teacher;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Board> arrBoard = new ArrayList<>();
        for(int i=0; i<5; i++){
            Board bd1 = new Board();
            bd1.setNo(i);
            bd1.setTitle("더미"+i);
            bd1.setAuthor("더미"+i);
            bd1.setCnt(0);
            bd1.setResdate("2023-07-20");
            bd1.setContents("Content"+i);
            arrBoard.add(bd1);
        }
        for(Board b:arrBoard){
            System.out.println(b.getContents());
        }
        prt(arrBoard);
    }

    public static void prt(ArrayList<Board> lst){
        for(Board b:lst){
            System.out.println(b.getAuthor());
        }
    }
}
