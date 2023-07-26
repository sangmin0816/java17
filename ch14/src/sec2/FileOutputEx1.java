package sec2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("out2.txt");
            String str = "hi hello";
            fos.write(str.getBytes());
            fos.close();
        } catch (IOException e){
            System.out.println("파일이 존재하지 않거나, 경로가 틀렸습니다.");
            e.printStackTrace();
        }
        try{
            FileInputStream fis = new FileInputStream("out2.txt");
            for(int b:fis.readAllBytes()){
                System.out.print((char)b);
            }
            fis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
