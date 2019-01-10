/**
 * Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree{1,#,2,3},

 1
 \
 2
 /
 3

 return[1,2,3].

 Note: Recursive solution is trivial, could you do it iteratively?
 */
package leetcode;
import java.util.ArrayList;

public class PreorderTraversal {
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> preorderTraversal(TreeNode root) {

        if (root == null){
            return result;
        }

        result.add(root.val);
        ArrayList<Integer> left = preorderTraversal(root.left);
        ArrayList<Integer> right = preorderTraversal(root.right);

        return result;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        ArrayList<Integer> r = new PreorderTraversal().preorderTraversal(t1);
        int t = 0;
    }
}
