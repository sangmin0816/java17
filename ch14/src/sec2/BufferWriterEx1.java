package sec2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx1 {
    public static void main(String[] args) {
        String path = "d:\\out3.txt"; // 제어문자이므로 역 슬래쉬 2개 \\ 쓰는 거 잊지 말기
        File file = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("곧 점심시간이다.");
            
            writer.close(); // 먼저 닫아야 Exception 발생 안 함
            fw.close();
        }catch (Exception e){e.printStackTrace();}
    }

}
