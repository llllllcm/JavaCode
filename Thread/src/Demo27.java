

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
}
public class Demo27 {
    public static TreeNode build() {
        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();
        TreeNode f = new TreeNode();
        TreeNode g = new TreeNode();
        a.value = 1;
        b.value = 1;
        c.value = 1;
        d.value = 1;
        e.value = 1;
        f.value = 1;
        g.value = 1;

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }
    public static void main(String[] args) {
        TreeNode root = build();
    }
}
