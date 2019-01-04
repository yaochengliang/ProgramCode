/**
 * Given a binary tree, find its minimum depth.The minimum depth is the number of nodes along the shortest path
 * from the root node down to the nearest leaf node.
 */
package leetcode;

public class MinTreeDepth {
    public int run(TreeNode root) {
        if (root == null){
            return 0;
        }

        int leftDepth = Integer.MAX_VALUE;
        if (root.left != null){
            leftDepth = run(root.left);
        }
        int rightDepth = Integer.MAX_VALUE;
        if (root.right != null){
            rightDepth = run(root.right);
        }

        int max = 0;
        if (leftDepth == Integer.MAX_VALUE && rightDepth == Integer.MAX_VALUE){
            max = 0;
        } else {
            max = leftDepth < rightDepth?leftDepth:rightDepth;
        }

        return max+1;
    }

    public int run2(TreeNode root) {
        if (root == null){
            return 0;
        }

        int leftDepth = run(root.left);
        int rightDepth = run(root.right);

        if (leftDepth == 0 || rightDepth == 0){
            return leftDepth+rightDepth+1;
        }

        return Math.min(leftDepth,rightDepth)+1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        t1.left = t2;
//        t1.right = t3;
//        t2.right = t5;
//        t5.left = t8;
//        t3.left = t6;
//        t3.right = t7;
//        t6.left = t4;

        System.out.println(new MinTreeDepth().run2(t1));
    }
}

//Definition for binary tree
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

