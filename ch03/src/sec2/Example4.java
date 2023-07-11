package sec2;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("달력");
        System.out.println("월\t화\t수\t목\t금\t토\t일");
        for(int i=1; i<=31; i++){
            System.out.printf("%2d\t", i);
            if(i%7==0){
                System.out.println();
            }
        }
        
        System.out.println("\n");
        System.out.println("올라가는 별");
        for(int i=1; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("내려가는 별");
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("피라미드 별");
        for(int i=1; i<=5; i++){
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("다이아몬드 별");
        for(int i=1; i<=5; i++){
            for(int j=10; j>i*2; j-=2){
                System.out.print(" ");
            }
            for(int j=1; j<i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4; i>0; i--){
            for(int j=10; j>i*2; j-=2){
                System.out.print(" ");
            }
            for(int j=1; j<i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        
        System.out.println();
        System.out.println("구구단");
        for(int i=1; i<10; i++){
            for(int j=2; j<10; j++){
                System.out.printf("%d x %d = %2d\t", j, i, i*j);
            }
            System.out.println();
        }
    }
}
