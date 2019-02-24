package real;
/**
 * 题目描述
 有两个字符串（可能包含空格）,请找出其中最长的公共连续子串,输出其长度。

 输入描述:
 给定两行字符串

 长度在1000以内
 输出描述:
 输出这两个字符串的最长公共连续子串的长度
 示例1
 输入
 abcde
 bcd
 输出
 3
 */

import java.util.Scanner;

public class Tuniu01 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int maxLength = 0;
        for (int i=0; i<str1.length(); i++){
            for (int j=i; j<str1.length(); j++){
                String temp = str1.substring(i,j);
                if (str2.indexOf(temp) != -1){
                    maxLength = Math.max(maxLength,temp.length());
                }
            }
        }

        System.out.println(maxLength);
    }
}
