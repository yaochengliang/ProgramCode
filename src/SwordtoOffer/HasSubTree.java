package SwordtoOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述
 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

public class HasSubTree {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(8);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(9);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
//        TreeNode t71 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
//        t7.left = t71;

        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        TreeNode t10 = new TreeNode(2);
        t8.left = t9;
        t8.right = t10;

        System.out.println(hasSubtree(t1,t8));
    }

    public static boolean hasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root1);

        while (!queue.isEmpty()){
            TreeNode head = queue.poll();
            if (head.val == root2.val){
                if (isSame(head,root2)){
                    return true;
                }
            }

            if (head.left != null){
                queue.offer(head.left);
            }

            if (head.right != null){
                queue.offer(head.right);
            }
        }

        return false;
    }

    public static boolean isSame(TreeNode root1, TreeNode root2){
        if (root2 == null){
            return true;
        }

        if ((root1 == null && root2 != null)){
            return false;
        }

        if (root1.val == root2.val){
            if (isSame(root1.left,root2.left) && (isSame(root1.right,root2.right))){
                return true;
            }
        }

        return false;
    }
}
