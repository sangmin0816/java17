package sec3;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException, Exception {
        FileReader fr = new FileReader("out2.txt");
        int rd = fr.read();
        while(rd!=-1){
            System.out.print((char)rd);
            rd = fr.read();
        }
    }
}
