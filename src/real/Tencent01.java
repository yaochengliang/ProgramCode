package real;
/**
 * 题目描述

 小Q从牛博士那里获得了一个数字转换机，这台数字转换机必须同时输入两个正数a和b，并且这台数字转换机有一个红色的按钮和一个蓝色的按钮：

 当按下了红色按钮，两个数字同时加1。

 当按下了蓝色按钮，两个数字同时乘2。

 小Q现在手中有四个整数a，b，A，B，他希望将输入的两个整数a和b变成A，B（a对应A，b对应B）。因为牛博士允许小Q使用数字转换机的时间有限，所以小Q希望按动按钮的次数越少越好。请你帮帮小Q吧。

 输入描述:
 输入包括一行，一行中有四个正整数a，b，A，B，（1≤a，b，A，B≤10^9）。
 输出描述:
 如果小Q可以完成转换，输出最少需要按动按钮的次数，否则输出-1。
 示例1
 输入
 100  1000  202  2002
 输出
 2
 */

import java.util.Scanner;

public class Tencent01 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputs = input.split(" ");
        int[] ins = new int[4];
        int times = -1;
        for (int i=0; i<4; i++){
            ins[i] = Integer.parseInt(inputs[i]);
        }

        if (ins[0]<1 || ins[0]>(10^9) || ins[0]>ins[2] || ins[1]<1 || ins[1]>(10^9) || ins[1]>ins[3] ||
                ins[2]<1 || ins[2]>(10^9) || ins[3]<1 || ins[3]>(10^9)){
            times = -1;
        } else {
            times = change(ins[0], ins[1], ins[2], ins[3]);
        }

        System.out.println(times);
    }

    public static int change(int a,int b,int A,int B){
        int time = 0;
        if (a == A && b == B){
            time = 0;
        } else {
            if (2*a < A && 2*b < B){
                time ++;
                time += change(2*a,2*b,A,B);
            }

            if (a+1 < A && b+1 < B){
                time ++;
                time += change(a+1,b+1,A,B);
            }

            if (a > A || b>B){
                time = -1;
            }
        }
        return time;
    }
}
