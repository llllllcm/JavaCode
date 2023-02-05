import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-04
 * Time: 13:07
 */
//穷举二叉树

public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

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
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    //后序遍历
    void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    List<Integer> list = new ArrayList<>();
    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return list;
        list.add((int) root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
    //子问题思想
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        list.add((int) root.val);
        List<Integer> leftTree = preorderTraversal(root.left);
        list.addAll(leftTree);
        List<Integer> rightTree = preorderTraversal(root.right);
        list.addAll(rightTree);
        return list;
    }

    /**
     * 求树的节点个数
     * @return
     */
    //子问题思维
    int size(TreeNode root) {
        if (root == null) return 0;
        return size(root.left) + size(root.right) + 1;
    }
    //遍历思维
    public static int nodeSize;
    void size2(TreeNode root) {
        if (root == null) return;
        nodeSize++;
        size2(root.left);
        size2(root.right);
    }

    /**
     * 获取叶子节点个数
     * @param root
     * @return
     */
    //子问题
    int getLeafNodeCount(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount(root.right)+getLeafNodeCount(root.left);
    }

    //遍历
    public static int leafSize;
    void getLeafNodeCount2(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafNodeCount2(root.left);
        getLeafNodeCount2(root.right);
    }
    //求第k层节点个数
    int getLevelNodeCount(TreeNode root,int k) {
        if (root == null) return 0;
        if (k == 1) return 1;
        return getLevelNodeCount(root.left,k-1)
                + getLevelNodeCount(root.right,k-1);

    }
    //求树的高度
    int getHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.right),
                getHeight(root.left)) + 1;
    }
    //检测值为val的值是否存在
    TreeNode find(TreeNode root,int val) {
        if(root == null) return null;
        if (root.val == val) return root;
        TreeNode node1 = find(root.right,val);
        if (node1 != null) {
            return node1;
        }
        TreeNode node2 = find(root.left,val);
        if (node2 != null) {
            return node2;
        }
        return null;
    }
    //判断两棵树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //先判断两个是否其中有一个为空
        if(p == null && q != null || p != null && q== null) {
            return false;
        }
        if(p == null & q == null) {
            return true;
        }
        //第一个if和第三个if不能放在一起，因为可能造成空指针异常。
        if(p.val != q.val ) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(q.right,p.right);
    }
    //判断图中的树是否为另一颗树的子树
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        return isSubtree(root.left,subRoot.left) && isSubtree(root.right,subRoot.right);
    }
    //判断树是否为平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    //时间复杂度进行优化
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left >= 0 && right>= 0 && Math.abs(left - right) <= 1) {
            return Math.max(left,right) + 1;
        }else {
            return -1;
        }
    }
    public boolean isBalanced2(TreeNode root) {
        if(root == null) return true;
        return maxDepth(root) >= 0;
    }

    /**
     * 是否为对称树
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricChild(root.left,root.right) ;
    }
    private boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree == null && rightTree != null) return false;
        if(leftTree != null && rightTree == null) return false;
        if(leftTree == null && rightTree == null) return true;
        if(leftTree.val != rightTree.val) return false;
        //执行到这一步说明值是一样的，并且不为空
        return isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(leftTree.right,rightTree.left);
    }

    void levelOrder1(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur.val + " ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    /**
     * 层序遍历 非递归
     * @param root
     * @return
     */

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<>();
        if(root == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            while(size > 0) {
                size--;
                TreeNode cur = queue.poll();
                row.add((int) cur.val);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(row);
        }
        return ret;
    }

}
