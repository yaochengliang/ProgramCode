/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
package SwordtoOffer;

public class Power {
    public double power(double base, int exponent) {
        return Math.pow(base,exponent);
    }

    public double power2(double base, int exponent) {
        double result = 1;
        if (exponent == 0){
            result = 1;
        } else {
            for (int i=0; i<Math.abs(exponent); i++){
                result *= base;
            }

            if (exponent < 0){
                result = 1/result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Power().power2(2,-3));
    }
}
