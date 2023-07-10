package sec2;

public class Example7 {
    public static void main(String[] args) {
        // 자동 형변환 auto casting: 같거나 더 큰 크기 범위로만 형변환된다. But char와 short는 크기는 같지만 범위가 달라서 형변환이 안 된다.
        // char -> int 변환하면 유니코드 번호로 변환된다.

        // 강제 형변환. (데이터 타입)으로 강제로 형변환할 수 있지만 원하는 값이 출력되지 않을 수 있다.
        // 강제 형봔한: 형변한연산자를 활용하는 형변환이다. 데이터의 신빙성이 떨어져 사용을 권고하지 않는다.

        int data1 = 1004;
        float data2 = data1;

        char data3 = '김';
        int data4 = data3;

        int data5 = 2048;
        byte data6 = (byte) data5;

        System.out.println(data1+" "+data2+" "+data3+" "+data4+" "+data5+" "+data6);

    }
}
