package real;
/**
 * 题目描述
 菲波那契数列是指这样的数列：数列的第一个和第二个数都为1，接下来每个数都等于前面2个数之和。给出一个正整数K，要求菲波那契数列中第k个数是多少。

 输入描述:
 输入一行，包含一个正整数k。(0<k<47)
 输出描述:
 输出一行，包含一个正整数，表示菲波那契数列中第k个数的大小
 示例1
 输入
 19
 输出
 4181
 */

import java.util.Scanner;

public class Beike01 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int n = Integer.parseInt(input);
        if (n<0 || n>=47){
            System.out.println(0);
        } else if (n == 1){
            System.out.println(1);
        } else if (n == 2){
            System.out.println(2);
        } else {
            System.out.println(cal(n));
        }
    }

    public static int cal(int n){
        int num1 = 1;
        int num2 = 1;
        for (int i=3; i<= n; i++){
            int tmp = num1 + num2;
            num1 = num2;
            num2 = tmp;
        }
        return num2;
    }
}
