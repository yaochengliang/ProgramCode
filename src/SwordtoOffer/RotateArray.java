/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
package SwordtoOffer;

public class RotateArray {

    /**
     * 遍历 时间为O（N）
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0){
            return 0;
        }

        for (int i=0; i<array.length-1; i++){
            if (array[i] > array[i+1]){
                return array[i+1];
            }
        }

        return array[0];
    }

    /**
     * 二分查找 时间为 O（log2N）
     * @param array
     * @return
     */
    public int minNumberInRotateArray2(int [] array) {
        if (array == null || array.length == 0){
            return 0;
        }

        int high = array.length-1;
        int low = 0;

        if (array[low] < array[high]){
            return array[low];
        }

        while (low < high){
            if (array[low] < array[high]){
                return array[low];
            }

            if (high - low == 1){
                return array[high];
            }

            int mid = (high + low)/2;
            if (array[mid] >= array[low]){
                low = mid;
            }

            if (array[mid] <= array[high]){
                high = mid;
            }
        }

        return array[0];
    }

    public static void main(String[] args) {
        int a[] = {3,4,5,6,1,2};
        System.out.println(new RotateArray().minNumberInRotateArray2(a));
    }
}
