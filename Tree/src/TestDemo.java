/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-04
 * Time: 16:15
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.TreeNode root = binaryTree.createTree();
        System.out.println("前序遍历");
        binaryTree.preOrder(root);
        System.out.println();
        System.out.println("中序遍历");
        binaryTree.inOrder(root);
        System.out.println();
        System.out.println("后序遍历");
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println("节点的个数："+binaryTree.size(root));
        binaryTree.size2(root);
        System.out.println("节点的个数2："+BinaryTree.nodeSize);

    }
}
