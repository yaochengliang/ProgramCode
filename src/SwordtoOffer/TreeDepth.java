package SwordtoOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */

public class TreeDepth {

    //递归
    public static int treeDepth1(TreeNode root){

        if (root == null){
            return 0;
        }

        int left = treeDepth1(root.left);
        int right = treeDepth1(root.right);

        return (left>right)?left+1:right+1;
    }

    //非递归
    public static int treeDepth2(TreeNode root){

        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            int cur = 0;
            while (cur < size){
                TreeNode p = queue.poll();
                if (p.left != null){
                    queue.offer(p.left);
                }
                if (p.right != null){
                    queue.offer(p.right);
                }
                cur ++;
            }
            depth ++;
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        t1.left = t2;
        t1.right = t3;

        t3.left = t4;

        t4.left = t5;
        t4.right = t6;

        t6.right = t7;

        System.out.println(treeDepth2(t1));
    }
}
