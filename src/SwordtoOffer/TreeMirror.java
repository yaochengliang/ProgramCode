package SwordtoOffer;

import com.sun.jdi.Mirror;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 题目描述
 操作给定的二叉树，将其变换为源二叉树的镜像。
 输入描述:
 二叉树的镜像定义：源二叉树
       8
     /  \
    6   10
   / \  / \
  5  7 9 11
 镜像二叉树
        8
      /  \
     10   6
    / \  / \
   11 9 7  5
 */

public class TreeMirror {

    /**
     * 方法1 递归
     * @param root
     */
    public static void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if (root.left != null){
            Mirror(root.left);
        }

        if (root.right != null){
            Mirror(root.right);
        }
    }

    /**
     * 方法2 层次遍历
     * @param root
     */
    public static void Mirror2(TreeNode root){
        if (root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode head = queue.poll();

            TreeNode tmp = head.left;
            head.left = head.right;
            head.right = tmp;

            if (head.left != null){
                queue.offer(head.left);
            }

            if (head.right != null){
                queue.offer(head.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(10);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(11);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        Mirror2(t1);
        System.out.println();
    }
}
