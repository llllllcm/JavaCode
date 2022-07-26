/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-26
 * Time: 21:18
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createTree();
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        System.out.println("中序遍历");
        binaryTree.inOrder(binaryTree.root);
    }
}
