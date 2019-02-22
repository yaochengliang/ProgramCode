package real;
/**
 * 题目描述
 请从字符串中找出至少重复一次的子字符串的最大长度
 输入描述:
 字符串，长度不超过1000
 输出描述:
 重复子串的长度，不存在输出0
 示例1
 输入
 ababcdabcefsgg
 输出
 3
 说明
 abc为重复的最大子串，长度为3

 参考地址：https://www.cnblogs.com/xiaodeyao/p/5332834.html
 */

import java.util.Scanner;

public class Huanjushidai01 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
//        String line = "addwabcdssabcd";
        char[] strs = line.toCharArray();
        int[][] table = new int[strs.length+1][strs.length+1];
        for (int i=0; i<strs.length; i++){
            for (int j=0; j<strs.length; j++){
                if (i == j){
                    continue;
                } else {
                    if (strs[i] == strs[j]){
                        table[i+1][j+1] = table[i][j]+1;
                    }
                }
            }
        }

//        for (int i=0; i<=strs.length; i++){
//            for (int j=0; j<=strs.length; j++){
//                System.out.print(table[i][j]+"  ");
//            }
//            System.out.println();
//        }

        int max=0;
        for (int i=0; i<table.length; i++){
            for (int j=0; j<table[i].length; j++){
                if (table[i][j] > max){
                    max = table[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
