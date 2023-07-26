package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;

public class StreamEx1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("out1.txt");
            String str = "hi hello";
            byte[] arr = str.getBytes();
            fos.write("한글 가능?".getBytes());
            fos.write(arr);
            fos.close();
        } catch (IOException e){
            System.out.println("파일이 존재하지 않거나, 경로가 틀렸습니다.");
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("out1.txt");
            int i = fis.read();
            fis.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
