package leet100.same_tree;

/**
 * Created by Administrator on 2016/4/20.
 */
public class Leet100 {

    public static void main(String[] args) {
        Leet100 l = new Leet100();

        TreeNode p = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        p.left = p1;
        TreeNode p2 = new TreeNode(2);
        p.right = p2;

        TreeNode q = new TreeNode(1);
        TreeNode q1 = new TreeNode(2);
        q.left = q1;
        TreeNode q2 = new TreeNode(3);
        q.right = q2;

        boolean result = l.isSameTree(p, q);
        System.out.println(result);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q == null || p == null && q != null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
