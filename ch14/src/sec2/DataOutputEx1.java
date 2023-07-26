package sec2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputEx1 {
    public static void main(String[] args) {
        try{
            File file = new File("out7.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF("안녕하세요");
            dos.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
