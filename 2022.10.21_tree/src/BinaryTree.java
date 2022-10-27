/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-23
 * Time: 8:38
 */

import java.io.*;
import java.awt.*;
public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }
    //二叉树的根节点

    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }
    //前序遍历
    void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);


    }

    // 中序遍历
    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);


    }
    // 后续遍历
    void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    // 子问题   获取树中节点的个数
    int size(TreeNode root) {
        if(root == null) return 0;
        int left = size(root.left);
        int right = size(root.right);
        return left+right+1;
    }
    //遍历思路
    public static int nodeSize;
    void size2(TreeNode root) {
        if(root != null) {
            nodeSize++;
            size2(root.left);
            size2(root.right);
        }else {
            return;
        }
    }
    // 子问题 获取叶子节点的个数
    int getLeafNodeCount(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount(root.left)+getLeafNodeCount(root.right);

    }
    static int leafNode;
    //遍历思想
    void getLeafNodeCount2(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            leafNode++;
        }
        getLeafNodeCount2(root.right);
        getLeafNodeCount2(root.left);
    }
    //获取第k层的节点个数
    int getKLevelNodeCount(TreeNode root,int k) {
        if(k <= 0) return -1;
        if (root == null) return 0;
        if(k == 1) return 1;
        return getKLevelNodeCount(root.left,k-1) + getKLevelNodeCount(root.right,k-1);
    }
    //获取二叉树的高度
    //左树的高度和右树的高度的最大值
    int getHeight(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return Math.max(getHeight(root.right),getHeight(root.left)) + 1;
    }

    // 检测值为value的元素是否存在
    TreeNode find(TreeNode root, int val) {
        if(root == null) return null;
        if (root.val == val) {
            return root;
        }
        TreeNode l1 = find(root.right,val);
        if(l1 != null) {
            return l1;
        }
        TreeNode l2 = find(root.left,val);
        if(l2 != null) {
            return l2;
        }
        return null;
    }

}
