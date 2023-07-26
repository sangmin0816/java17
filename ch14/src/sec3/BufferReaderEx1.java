package sec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("out2.txt"));
        String data;
        while((data = br.readLine())!=null){
            System.out.println(data);
        }

    }
}
