package real;

import java.util.Scanner;

/**
 * 题目描述
 输入一个有符号整数，输出该整数的反转值。
 输入描述:
 一个整数
 输出描述:
 一个整数
 示例1
 输入
 复制
 123
 输出
 复制
 321
 说明
 示例2
 输入
 复制
 -123
 输出
 复制
 -321
 说明
 示例3
 输入
 复制
 200
 输出
 复制
 2
 */

public class Xunlei03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
//        String input = "-200";
        boolean flag = false;
        if (input.startsWith("-")){
            flag = true;
            input = input.substring(1);
        }

        StringBuilder builder = new StringBuilder();
        for (int i=input.length()-1; i>=0; i--){
            builder.append(input.charAt(i));
        }

        if(flag){
            builder.insert(0,"-");
        }

        System.out.println(Integer.parseInt(builder.toString()));
    }
}
