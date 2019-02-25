package real;
/**
 * 题目描述
 对于一个整数N（512 <= N <= 1024），计算2的N次方并在屏幕显示十进制结果。
 输入描述:
 输入一个整数N（512 <= N <= 1024）
 输出描述:
 2的N次方的十进制结果
 示例1
 输入
 512
 输出
 13407807929942597099574024998205846127479365820592393377723561443721764030073546976801874298166903427690031858186486050853753882811946569946433649006084096
 */

import java.util.Scanner;

public class Xunlei01 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] result = new int[1000];
        result[0] = 1;
        int t=1;
        while (t<=n){
            for (int i=0; i<result.length; i++){
                int tmp = result[i];
                tmp *= 2;
                result[i] = tmp;
            }
            for (int i=0; i<result.length-1; i++){
                int tmp = result[i];
                if (tmp >= 10){
                    result[i] = tmp%10;
                    result[i+1] += tmp/10;
                }
            }
            t++;
        }

        boolean flag=false;
        StringBuilder builder = new StringBuilder();
        for (int i=result.length-1; i>=0; i--){ //从后往前，不是0的第一个开始输出
            if (result[i] != 0){
                flag = true;
            }

            if (flag == true){
                builder.append(result[i]);
            }
        }

        System.out.println(builder.toString());
    }
}
