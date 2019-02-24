package real;
/**
 * 题目描述
 小明去附近的水果店买橙子，水果商贩只提供整袋购买，有每袋6个和每袋8个的包装（包装不可拆分）。可是小明只想购买恰好n个橙子，并且尽量少的袋数方便携带。如果不能购买恰好n个橙子，小明将不会购买。

 输入描述:
 输入一个整数n，表示小明想要购买n（1≤n≤100）个橙子
 输出描述:
 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个橙子则输出-1
 示例1
 输入
 20
 输出
 3
 */

import java.util.Scanner;

public class Kugou01 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i=n/8; i>=0; i--){
            if (0 == (n-i*8)%6){
                System.out.println(i+(n-i*8)/6);
                return;
            }
        }
        System.out.println(-1);
    }
}
