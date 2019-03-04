package SwordtoOffer;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

import java.util.ArrayList;

public class PrintMatrix {
    public static void main(String[] args) {

//        int[][] m = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(m);
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        while (rows > start*2 && columns > start*2){
            int row_end = rows-1-start;
            int column_end = columns-1-start;

            for (int i=start; i<=column_end; i++){
                list.add(matrix[start][i]);
            }

            if (row_end > start){
                for (int i=start+1; i<=row_end; i++){
                    list.add(matrix[i][column_end]);
                }
            }

            if (row_end > start && column_end > start){
                for (int i=column_end-1; i>=start; i--){
                    list.add(matrix[row_end][i]);
                }
            }

            if (row_end >= start+2 && column_end > start ){
                for (int i=row_end-1; i> start; i--){
                    list.add(matrix[i][start]);
                }
            }

            start ++;
        }

        for (int i:list) {
            System.out.print(i + " ");
        }

        return list;
    }
}
