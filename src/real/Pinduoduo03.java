package real;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目描述
 六一儿童节，老师带了很多好吃的巧克力到幼儿园。每块巧克力j的重量为w[j]，对于每个小朋友i，当他分到的巧克力大小达到h[i] (即w[j]>=h[i])，
 他才会上去表演节目。老师的目标是将巧克力分发给孩子们，使得最多的小孩上台表演。可以保证每个w[i]> 0且不能将多块巧克力分给一个孩子或将一块分给多个孩子。
 输入描述:
 第一行：n，表示h数组元素个数
 第二行：n个h数组元素
 第三行：m，表示w数组元素个数
 第四行：m个w数组元素
 输出描述:
 上台表演学生人数
 示例1
 输入
 3
 2 2 3
 2
 3 1
 输出
 1
 */

public class Pinduoduo03 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String h = in.nextLine();
        int m = Integer.parseInt(in.nextLine());
        String w = in.nextLine();
        String[] harray = h.split(" ");
        String[] warray = w.split(" ");
        int[] harr = new int[n];
        int[] warr = new int[m];
        for (int i=0; i<n; i++){
            harr[i] = Integer.parseInt(harray[i]);
        }
        for (int i=0; i<m; i++){
            warr[i] = Integer.parseInt(warray[i]);
        }

        Arrays.sort(harr);
        Arrays.sort(warr);
        boolean[] flag = new boolean[n];
        int sum = 0;

        for (int i=m-1; i>=0 ; i--){
            for (int j=n-1; j>=0; j--){
                if (flag[j]){
                    continue;
                }
                if (warr[i] >= harr[j]){
                    sum ++;
                    flag[j] = true;
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
