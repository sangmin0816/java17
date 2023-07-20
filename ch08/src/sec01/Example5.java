package sec01;

public class Example5 {
    static class Animal{}
    static class Tiger extends Animal{}
    static class Lion extends Animal{}
    public static void main(String[] args) {
        Animal ani;
        ani = new Tiger();
        ani = new Lion();

        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        changeObject1(tiger);
        changeObject2(lion);
    }

    public static void changeObject1(Animal a){
        try{
            Lion l = (Lion) a;
        } catch (ClassCastException e){
            System.out.println("형 변환 불가");
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void changeObject2(Animal a){
        try{
            Tiger t = (Tiger) a;
        } catch (ClassCastException e){
            System.out.println("형 변환 불가");
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
