package real;
/**
 * 题目描述
 有两个用字符串表示的非常大的大整数,算出他们的乘积，也是用字符串表示。不能用系统自带的大整数类型。
 输入描述:
 空格分隔的两个字符串，代表输入的两个大整数
 输出描述:
 输入的乘积，用字符串表示
 示例1
 输入
 72106547548473106236 982161082972751393
 输出
 70820244829634538040848656466105986748
 */

import java.util.Scanner;

public class Pinduoduo02 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
//        String line = "11 11";
        String[] input = line.split(" ");
        char[] str1 = input[0].toCharArray();
        char[] str2 = input[1].toCharArray();
        int[] num1 = new int[str1.length];
        int[] num2 = new int[str2.length];
        int[] result = new int[str1.length + str2.length]; //保留结果

        for (int i=0; i<str1.length; i++){ //将字符转为整型
            num1[i] = str1[i] - '0';
        }
        for (int i=0; i<str2.length; i++){
            num2[i] = str2[i] - '0';
        }

        for (int i=0; i<str1.length; i++){ //计算结果
            for (int j=0; j<str2.length; j++){
                result[i+j] += num1[i]*num2[j];
            }
        }

        for (int i=result.length-1; i>0; i--){ //处理进位
            result[i-1] += result[i]/10;
            result[i] = result[i]%10;
        }

        StringBuilder builder = new StringBuilder();
        for (int i=0; i<result.length-1; i++){
            builder.append(result[i]);
        }
        System.out.println(builder.toString());
    }
}
