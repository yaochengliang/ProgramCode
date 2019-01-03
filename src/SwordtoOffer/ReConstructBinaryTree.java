/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
package SwordtoOffer;

import java.util.HashMap;
import java.util.Map;

public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null){
            return null;
        }

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<in.length; i++){
            map.put(in[i],i);
        }

        return createTree(pre,0,pre.length-1,in,0,in.length-1,map);
    }

    public TreeNode createTree(int[] pre,int preBegin,int preEnd,int[] in,int inBegin,int inEnd,Map<Integer,Integer> map){
        if (preBegin > preEnd){
            return null;
        }
        TreeNode head = new TreeNode(pre[preBegin]);
        int index = map.get(pre[preBegin]);
        head.left = createTree(pre,preBegin+1,preBegin+index-inBegin,in,inBegin,index-1,map);
        head.right = createTree(pre,preBegin+index-inBegin+1,preEnd,in,index+1,inEnd,map);

        return head;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        ReConstructBinaryTree reConstructBinaryTree = new ReConstructBinaryTree();
        TreeNode head = reConstructBinaryTree.reConstructBinaryTree(pre,in);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

