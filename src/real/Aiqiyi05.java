package real;
/**
 * 题目描述
 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
 输入描述:
 输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
 输出描述:
 如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
 示例1
 输入
 1010 3 101010 2
 输出
 Equal
 */

import java.util.Scanner;

public class Aiqiyi05 {
    public static void main(String args[]){
//        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
        String line = "5 9 555555554 1";
        String[] inputs = line.split(" ");
        int n1 = Integer.parseInt(inputs[1]);
        int n2 = Integer.parseInt(inputs[3]);

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        for (int i=0; i<n1; i++){
            s1.append(inputs[0]);
        }

        for (int i=0; i<n2; i++){
            s2.append(inputs[2]);
        }

        char[] c1 = s1.toString().toCharArray();
        char[] c2 = s2.toString().toCharArray();

        if (c1.length < c2.length){
            System.out.println("Less");
        } else if (c1.length > c2.length){
            System.out.println("Greater");
        } else {
            for (int i=0; i<c1.length; i++){
                if (c1[i] == c2[i]){
                    continue;
                } else {
                    if (c1[i] < c2[i]){
                        System.out.println("Less");
                    } else {
                        System.out.println("Greater");
                    }
                    return;
                }
            }
            System.out.println("Equal");
        }
    }
}
