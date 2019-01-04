/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
package SwordtoOffer;

import java.util.ArrayList;
import java.util.List;

public class ReOrderArray {

    public void reOrderArray(int [] array) {
        for (int i=0; i<array.length-1;i++){
            for (int j=0; j<array.length-1-i;j++){ //array.length-1-i 每一次i循环后，保证的最后一个是偶数
                if (array[j]%2 == 0 && array[j+1]%2 == 1){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        for (int i:array) {
            System.out.print(i + "  ");
        }
    }

    public static void main(String[] args) {
        int a[] = {2,4,6,1,3,5,7};
        new ReOrderArray().reOrderArray(a);
    }
}
