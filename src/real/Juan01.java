package real;
/**
 * 给定一个字符串str，和一个字母ch，请实现相应的代码求出一个数组，使数组中每个数字表示该位置与字母ch之间的最短距离。
 比如str=”lexinfintech”  ch=”i”
 则输出为：[3,2,1,0,1,1,0,1,2,3,4,5]

 输入描述:
 第一行为字符串

 第二行为字母

 输出描述:
 一个数字数组

 输入例子1:
 lexinfintech
 i

 输出例子1:
 [3,2,1,0,1,1,0,1,2,3,4,5]
 */

import java.util.Scanner;

public class Juan01 {
    public static void main(String args[]){
//        Scanner in = new Scanner(System.in);
//        char[] line = in.nextLine().toCharArray();
//        char ch = in.nextLine().toCharArray()[0];
        char[] line = "lexinfintech".toCharArray();
        char ch = 'i';

        boolean[] times = new boolean[line.length];
        for (int i=0; i<line.length; i++){
            if (ch == line[i]){
                times[i] = true;
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i=0; i<line.length; i++){
            int distance=Integer.MAX_VALUE;
            for (int j=0; j<line.length; j++){
                if (times[j]){
                    int dis = Math.abs(i-j);
                    distance = Math.min(distance,dis);
                } else {
                    continue;
                }
            }
            sb.append(distance);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb.toString());
    }
}
