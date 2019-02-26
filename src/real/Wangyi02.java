package real;
/**
 * 题目描述
 如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。
 小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列
 输入描述:
 输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。
 第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。
 输出描述:
 如果可以变成等差数列输出"Possible",否则输出"Impossible"。
 示例1
 输入
 3
 3 1 2
 输出
 Possible
 */

import java.util.Arrays;
import java.util.Scanner;

public class Wangyi02 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String line = in.nextLine();
        String[] inputs = line.split(" ");
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(array);

        if (n==2){
            System.out.println("Possible");
        } else {
            for (int i=0; i<n-2; i++){
                if (array[i]-array[i+1] != array[i+1]-array[i+2]){
                    System.out.println("Impossible");
                    return;
                }
            }
            System.out.println("Possible");
        }
    }
}
