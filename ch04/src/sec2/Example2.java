package sec2;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[][] arr_2d = new int[3][5];
        System.out.println(arr_2d.length+" "+arr_2d[0].length);
        System.out.println(Arrays.deepToString(arr_2d));

        int [][][] arr_3d = new int[3][5][3];
        System.out.println(arr_3d.length+" "+arr_3d[0].length+" "+arr_3d[0][0].length);
        System.out.println(Arrays.deepToString(arr_3d));

        for(int i=0; i<arr_2d.length; i++){
            for(int j=0; j<arr_2d[0].length; j++){
                System.out.print(arr_2d[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i<arr_3d.length; i++){
            for(int j=0; j<arr_3d[0].length; j++){
                for(int k=0; k<arr_3d[0][0].length; k++){
                    System.out.print(arr_3d[i][j][k]);
                }
                System.out.println();
            }
            System.out.println("---------");
        }
    }
}

