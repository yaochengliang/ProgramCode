/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
package SwordtoOffer;

public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        char[] binary = Integer.toBinaryString(n).toCharArray();
        System.out.println(binary);
        for (char i:binary) {
            if (i == '1'){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOf1().NumberOf1(-3));
    }
}
