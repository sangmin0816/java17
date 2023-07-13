package sec2;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        String code = "801225-123456";
        char gender = code.charAt(7);
        System.out.println(gender);

        if(gender == '1' || gender=='3'){
            System.out.println("male");
        }
        System.out.println((gender=='2'||gender=='4')?gender: "No");

        System.out.println("생년월일"+code.substring(0, 6));
        System.out.println("생일: "+code.substring( 0, 2)+"-"+code.substring(2, 4)+"-"+code.substring(4, 6));

        String nick = "sangmin990816";
        System.out.println(nick.indexOf('9'));
        System.out.println(nick.lastIndexOf('9'));
        System.out.println(nick.concat("me"));
        char[] char_arr = nick.toCharArray();
        System.out.println(Arrays.toString(char_arr));

        System.out.println(nick.toUpperCase());
        System.out.println(nick.replace("sangmin", "sanga"));

        String age = "23";
        if(age.equals(String.valueOf(23))) System.out.println("age: "+age);

        String split_string = "a / b / c - d - e - f";
        String[] split_arr = split_string.split("/|-");
        System.out.println(Arrays.toString(split_arr));

        String blank_string = "             a      ";
        System.out.println(blank_string.strip());
        System.out.println(blank_string.trim());
        System.out.println(blank_string.stripLeading()+"A");
        System.out.println(blank_string.stripTrailing()+"a");
    }
}
