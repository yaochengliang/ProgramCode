package real;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 2017美团校招题目 超链接
 */

public class Meituan01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        TreeSet<String> treeSet = new TreeSet<>();

        //自定义比较器
//        TreeSet<String> treeSet = new TreeSet<>(new MyComparator());

        for (int i=0; i<n; i++){
            treeSet.add(in.next());
        }

        int m = in.nextInt();
        for (int i=0; i<m; i++){
            treeSet.remove(in.next());
        }

        for (String str:treeSet) {
            System.out.println(str);
        }
    }
}

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
