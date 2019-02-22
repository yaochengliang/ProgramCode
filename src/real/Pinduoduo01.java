package real;
/**
 * 题目描述
 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
 输入描述:
 无序整数数组A[n]
 输出描述:
 满足条件的最大乘积
 示例1
 输入
 3 4 1 2
 输出
 24
 */

import java.util.Arrays;
import java.util.Scanner;

public class Pinduoduo01 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String line = in.nextLine();
//        int n = 61;
//        String line = "3472 -7098 -9281 7789 7955 6101 5051 7778 3090 7423 -7151 5652 1595 -8094 677 -8324 8347 -2482 9313 -9338 -3157 8559 6945 3618 3087 121 -8468 3225 1356 6939 2799 -7231 -6309 -5453 633 -8689 -4776 2714 -2743 -1409 5918 -3333 1803 8330 -2206 -6117 -4486 -7903 -4375 -3739 2897 8056 -5864 -522 7451 -4541 -2813 5790 -532 -6517 925";
        String[] arrs = line.split(" ");
        long[] arrays = new long[n];
        for (int i=0; i<n; i++){
            arrays[i] = Long.parseLong(arrs[i]);
        }

        Arrays.sort(arrays);

        long r1 = arrays[n-1]*arrays[n-2]*arrays[n-3];
        long r2 = arrays[0]*arrays[1]*arrays[n-1];
        if (r1 > r2){
            System.out.println(r1);
        } else {
            System.out.println(r2);
        }
    }
}
