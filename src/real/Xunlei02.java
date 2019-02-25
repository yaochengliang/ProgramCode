package real;

import java.util.Scanner;

/**
 * 题目描述
 给定整数n，取若干个1到n的整数可求和等于整数m，编程求出所有组合的个数。比如当n=6，m=8时，有四种组合：[2,6], [3,5], [1,2,5], [1,3,4]。限定n和m小于120
 输入描述:
 整数n和m
 输出描述:
 求和等于m的所有组合的个数。
 示例1
 输入
 6 8
 输出
 4

 参考：https://blog.csdn.net/qq_31548387/article/details/82714950
 */
public class Xunlei02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
//        int n = Integer.parseInt(line.split(" ")[0]);
//        int m = Integer.parseInt(line.split(" ")[1]);
        int n=6;
        int m=8;
        System.out.println(cal(n,m));
    }

    public static int cal(int n, int m){
        if (n <=0 || m <=0){
            return 0;
        }

        if (n > m){
            n = m;
        }

        int sum=0;
        if (n == m){
            sum ++;
        }

        sum += cal(n-1, m);
        sum += cal(n-1,m-n);
        return sum;
    }
}
