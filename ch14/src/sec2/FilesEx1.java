package sec2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesEx1 {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("d:\\out6.txt");
            System.out.println(path);
            Files.write(path, "hello. it's me".getBytes());
            // Files의 write는 static이므로 별도의 객체를 생성하지 않고 사용할 수 있다.
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
