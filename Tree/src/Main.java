import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-05
 * Time: 21:18
 */
public class Main {
    class TreeNode {

        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public int i = 0;

    public TreeNode createTree(String s) {
        TreeNode root = null;
        if(s.charAt(i) != '#') {
            root = new TreeNode(s.charAt(i));
            i++;
            root.left = createTree(s);
            root.right = createTree(s);
        }else {
            i++;
        }
        return root;
    }
    public void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String s = scan.nextLine();
            Main m = new Main();
            TreeNode root = m.createTree(s);
            m.inOrder(root);
        };
    }
}
