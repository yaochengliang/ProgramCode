package real;
/**
 * 题目描述
 用x,y表示一个整数范围区间，现在输入一组这样的范围区间(用空格隔开)，请输出这些区间的合并。
 输入描述:
 一行整数，多个区间用空格隔开。区间的逗号是英文字符。
 输出描述:
 合并后的区间，用过空格隔开，行末无空格
 示例1
 输入
 复制
 1,3 2,5
 输出
 复制
 1,5
 说明
 示例2
 输入
 复制
 1,3 2,5 8,10 11,15
 输出
 复制
 1,5 8,10 11,15
 说明
 备注:
 x,y均为正整数，并且x<=y。
 */

import java.util.*;

public class Xunlei04 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
        String input = "6,9 10,12 1,4 2,8 1,20";
        String[] inputs = input.split(" ");
        boolean[] flag = new boolean[inputs.length];
        List<Node> list = new ArrayList<>();
        for (int i=0; i<inputs.length; i++){
            list.add(new Node(Integer.parseInt(inputs[i].split(",")[0]),Integer.parseInt(inputs[i].split(",")[1])));
        }

        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.min == o2.min){
                    return o1.max - o2.max;
                } else {
                    return o1.min - o2.min;
                }
            }
        });

        for (int i=0; i<list.size()-1; i++){
            Node node1 = list.get(i);
            Node node2 = list.get(i+1);
            if(node2.min <= node1.max){
                node2.min = Math.min(node1.min,node2.min);
                node2.max = Math.max(node1.max,node2.max);
                flag[i] = true;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i=0; i<inputs.length; i++){
            if (!flag[i]){
                builder.append(list.get(i).min);
                builder.append(",");
                builder.append(list.get(i).max);
                builder.append(" ");
            }
        }

        System.out.println(builder.toString());
    }

}

class Node{
    int min = 0;
    int max = 0;

    public Node(int min, int max){
        this.min = min;
        this.max = max;
    }
}
