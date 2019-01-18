/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 Please note that your returned answers (both index1 and index2) are not zero-based.
 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */
package leetcode;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length <= 1){
            return null;
        }

        int i = 0;
        int j = 0;
        for (i=0; i< numbers.length-1; i++){
            for (j=i+1; j<numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    int[] result = new int[2];
                    result[0] = i+1;
                    result[1] = j+1;

                    return result;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] numbers={2, 7, 11, 15};
        int[] r = new TwoSum().twoSum(numbers,9);
    }
}
