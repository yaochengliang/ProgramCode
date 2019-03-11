package SwordtoOffer;

public class NumArrayDuplicate {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {

        if (numbers == null || length < 0){
            return false;
        }

        for (int i=0; i<length; i++){
            if (numbers[i] < 0 || numbers[i]>=length){
                return false;
            }
        }

        for (int i=0; i<length; i++){
            while (i != numbers[i]){
                if (i != numbers[i] && numbers[numbers[i]] == numbers[i]){
                    duplication[0] = numbers[i];
                    return true;
                }

                int tmp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = tmp;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {2,3,1,0,2,5,3};
        int[] b = new int[1];
        System.out.println(duplicate(a,a.length,b));
        System.out.println(b[0]);
    }
}
