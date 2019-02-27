package real;

import java.util.Scanner;

/**
 * 输入一个字符串，请找出该字符串的包含的最长回文子字符串
 比如，输入babcd，输出bab
 输入abbc，输出bb

 输入描述:
 只包含a-z的的字符串

 输出描述:
 入参的最长回文子字符串

 输入例子1:
 babcd

 输出例子1:
 bab
 */

public class Juan02 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String result = longestPalindrome(line);
        if (result.length() == 1){
            System.out.println();
        } else {
            System.out.println();
        }


    }

    //改为从中心出发寻找回文，降低复杂度
    public static String findPalindrome(String s, int left, int right) {
        int n = s.length();
        int l = left;
        int r = right;
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n<=1) return s;

        String longest = "";

        String str;
        for (int i=0; i<n-1; i++) {
            str = findPalindrome(s, i, i);
            if (str.length() > longest.length()){
                longest = str;
            }
            str = findPalindrome(s, i, i + 1);
            if (str.length() > longest.length()){
                longest = str;
            }
        }

        return longest;
    }

    //暴力求解
    public static String findLongestPalindrome(String s){
        int length = s.length();
        if (length < 2){
            return s;
        }
//        for (int i=length; i>=0; i--){
//            for (int j=0; j<=length-i; j++){
//                String str = s.substring(j,j+i);
//                if (judge(str)){
//                    return str;
//                }
//            }
//        }

        for (int i=length; i>=0; i--){
            for (int j=0; j<=i; j++){
                String str = s.substring(j,i);
                if (judge(str)){
                    return str;
                }
            }
        }
        return s;
    }

    public static boolean judge(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str = sb.toString();
        if (str.equals(s)){
            return true;
        }
        return false;
    }
}
