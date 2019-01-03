/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
package SwordtoOffer;

public class JumpFloorII {

    public int JumpFloorII(int target) {
        if (target == 1){
            return 1;
        } else {
            return 2*JumpFloorII(target - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new JumpFloorII().JumpFloorII(3));
    }
}
