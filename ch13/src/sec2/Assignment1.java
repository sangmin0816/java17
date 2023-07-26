package sec2;
@FunctionalInterface
interface Calculator<T extends Number, Q>{
    Q calc(T x, T y);
}

public class Assignment1 {
    public static void main(String[] args) {
        // 곱하기, 나누기, 더하기, 빼기 등 사칙 연산
        Calculator<Integer, Integer> plus = (x, y)->{return (x+y);};
        Calculator<Integer, Integer> minus = (x, y)->{return (x-y);};
        Calculator<Integer, Double> mul = (x, y)->{return (double)(x*y);};
        Calculator<Integer, Double> div = (x, y)->{return((double)x/y);};

        System.out.println(plus.calc(3, 5));
        System.out.println(minus.calc(10, 3));
        System.out.println(mul.calc(3, 5));
        System.out.println(div.calc(5, 7));
        
    }
}

