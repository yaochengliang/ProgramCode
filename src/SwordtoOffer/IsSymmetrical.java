package SwordtoOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */

public class IsSymmetrical {

    public static boolean isSymmetrical(TreeNode root){

        if (root == null){
            return true;
        }

        return isSymmetrical(root.left,root.right);
    }

    public static boolean isSymmetrical(TreeNode rootLeft, TreeNode rootRight){

        if (rootLeft == null && rootRight == null){
            return true;
        }

        if (rootLeft == null || rootRight == null){
            return false;
        }

        if (rootLeft.val == rootRight.val){
            return isSymmetrical(rootLeft.left,rootRight.right) && isSymmetrical(rootLeft.right,rootRight.left);
        }

        return false;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(5);
        TreeNode t7 = new TreeNode(5);
        TreeNode t8 = new TreeNode(5);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(5);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;

        t3.right = t5;

        t4.left = t6;

        t5.left = t7;

        System.out.println(isSymmetrical(t1));
    }
}
