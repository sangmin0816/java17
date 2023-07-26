package sec2;

import java.io.*;

public class PrinterWriterEx1 {
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
            PrintWriter writer = new PrintWriter(fw);
            writer.write("곧 점심시간이다. 다른 사람들은 갔다.");
            writer.println("\n배고파서\t힘들다");
            writer.print("\n저런");
            writer.close(); // 먼저 닫아야 Exception 발생 안 함
            fw.close();
        }catch (Exception e){e.printStackTrace();}


    }
}
