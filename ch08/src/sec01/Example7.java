package sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example7 {
    public static void main(String[] args) {
        // 파일 처리 작업은 반드시 try-catch 문 사용. 파일이 존재하지 않을 수 있다.
        try{
            FileInputStream fis = new FileInputStream("infile.txt");
            try{
                FileOutputStream fos = new FileOutputStream("outfile.txt");
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e){
                System.out.println(e.getMessage());
        }
    }
}
