package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class StreamEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fos = new FileOutputStream("out2.txt");
            String s = sc.nextLine();
            fos.write(s.getBytes());
            fos.close();
        }catch(Exception e){
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
    static byte[] indata() {
        Scanner sc = new Scanner(System.in);
        boolean job = true;
        byte[] c = new byte[1000];
        int i = 1;
        while (job) {
            System.out.println("문자 입력");
            c[i] = sc.nextByte();
            if(c[i] == 48) {
                job = false;
            }
            i++;
        }
        return c;
    }
}
