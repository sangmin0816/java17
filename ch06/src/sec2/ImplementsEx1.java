package sec2;

import sec01.Ariplane;
import sec01.DragonFly;
import sec01.Flying;

public class ImplementsEx1 {
    public static void main(String[] args) {
        Flying f1;
        Ariplane a1;
        DragonFly d1;

        f1 = new Flying() {
            @Override
            public void fly() {
                System.out.println("I'm Flying");
            }
        };
        f1.fly();
        f1 = new Ariplane();
        f1.fly();
        d1 = new DragonFly();
        d1.fly();
    }
}
