package teacher;

import java.util.ArrayList;
import java.util.List;

class Course{
    public int cNo;
    public String cName;
    public int cPrice;
    public double cTime;

    public Course() {
    }

    public Course(int cNo, String cName, int cPrice, double cTime) {
        this.cNo = cNo;
        this.cName = cName;
        this.cPrice = cPrice;
        this.cTime = cTime;
    }
}

public class Ex4 {
    static List<Course> cList = new ArrayList<>();
    public static void main(String[] args) {

    }

}
