package real;
/**
 * 题目描述
 玥玥带乔乔一起逃亡，现在有许多的东西要放到乔乔的包里面，但是包的大小有限，所以我们只能够在里面放入非常重要的物品。
 现在给出该种物品的数量、体积、价值的数值，希望你能够算出怎样能使背包的价值最大的组合方式，并且输出这个数值，乔乔会非常感谢你。

 输入描述:
 第1行有2个整数，物品种数n和背包装载体积v；

 第2行到i+1行每行3个整数，为第i种物品的数量m、体积w、价值s。
 输出描述:
 仅包含一个整数，即为能拿到的最大的物品价值总和。
 示例1
 输入
 2 10
 3 4 3
 2 2 5
 输出
 13
 说明
 选第一种一个，第二种两个，结果为3x1+5x2=13。
 备注:
 1≤v≤500

 1≤n≤2000

 1≤m≤10

 1≤w≤20

 1≤s≤100
 */

import java.util.Arrays;
import java.util.Scanner;

public class Beike02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        int n = in.nextInt();
        int v = in.nextInt();
        int[] t = new int[n];
        int[] w = new int[n];
        int[] s = new int[n];
        for (int i=0; i<n-1; i++){
            String line = in.nextLine();
            t[i] = in.nextInt();
            w[i] = in.nextInt();
            s[i] = in.nextInt();
        }
    }
}
