package sec01;

class Dbl{
    // Dbl은 default 제어자이면서, 다른 public class가 동일 파일 내에 있기 때문에 생성할 수 없다.
    public Dbl() {
    }
    private int col1;
    private String col2;

    public int getCol1() {
        return col1;
    }

    public void setCol1(int col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }
    public void method1(){
        System.out.println("This is dbl method1");
    }
}

public class Outer {
    public Outer() {
    }
    private int item1;
    private String item2;

    public Dbl dbl = new Dbl();

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public void method1(){
        System.out.println("외부 클래스의 method1");
    }
    public class Inner{
        public Inner() {
        }

        private int item3;
        private int item4;

        public int getItem3() {
            return item3;
        }

        public void setItem3(int item3) {
            this.item3 = item3;
        }

        public int getItem4() {
            return item4;
        }

        public void setItem4(int item4) {
            this.item4 = item4;
        }

        public void method2(){
            System.out.println("내부 클래스의 method2");
        }
    }

    public void dblMethod(){
        dbl.method1();
    }

}
