package sec1;
import java.util.Scanner;

import def_class.Person; // 패키지가 다른 경우는 import
// 같은 디렉토리 내에 있으면 쓸 수 있다.


public class Example1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape myShape = new Shape();
        myShape.type = "square";
        myShape.len = 50;
        myShape.area = myShape.len*myShape.len;

        System.out.println(myShape.type.toUpperCase()+" "+myShape.len+" "+myShape.area+"\n");

        Shape s2 = new Shape("circle", 3);
        s2.setHeight(3);
        System.out.println(s2.getHeight());
        
        System.out.println(s2.type.toUpperCase()+" "+s2.len+" "+s2.calc_area()+"\n");

        Person[] people = new Person[3];
        
        for(int i=0; i<people.length;i++){
            System.out.println("이름 나이 키");
            people[i] = new Person();
            people[i].name = scanner.next();
            people[i].age = scanner.nextInt();
            people[i].height = scanner.nextFloat();
        }

        System.out.println("\nPeople in Chunjae");
        for(Person p:people){
            System.out.println(p.name+" "+p.age+" "+p.height);
        }


    }
}
