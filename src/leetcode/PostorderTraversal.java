/*
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree{1,#,2,3},

   1
    \
     2
    /
   3

return[3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
 */
package leetcode;

import java.util.ArrayList;

public class PostorderTraversal {

    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> postorderTraversal(TreeNode root) {

        if (root == null){
            return result;
        }

        ArrayList<Integer> left = postorderTraversal(root.left);
        ArrayList<Integer> right = postorderTraversal(root.right);
        result.add(root.val);


        return result;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        ArrayList<Integer> r = new PostorderTraversal().postorderTraversal(t1);
    }
}

//Definition for binary tree
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}

