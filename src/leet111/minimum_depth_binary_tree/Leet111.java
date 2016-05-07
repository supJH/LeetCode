package leet111.minimum_depth_binary_tree;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/5/7.
 */
public class Leet111 {
    public static void main(String[] args) {
        Leet111 l = new Leet111();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
//        node2.left = node3;
//        node3.left = node4;

        int depth = l.minDepth(root);
        System.out.println(depth);
    }

//    public int minDepth(TreeNode root) {
//        if (root == null) return 0;
//        if(root.left == null && root.right == null) return 1;
//        int minDepth = 1;
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue = iterInRow(queue, root);
//        int i = 1;
//        while (!queue.isEmpty()) {
//            TreeNode outNode = queue.removeFirst();
//            i++;
//            if (outNode.right == null && outNode.left == null) {
//                int j = 1;
//                while ((i = i >>> 1) != 0) {
//                    j++;
//                }
//                return j;
//            }
//        }
//        return minDepth;
//    }
//
//
//    public LinkedList<TreeNode> iterInRow(LinkedList<TreeNode> queue, TreeNode node) {
//        if (node == null) {
//            return  queue;
//        }
//        queue.add(node);
//        iterInRow(queue, node.left);
//        iterInRow(queue, node.right);
//        return queue;
//    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<>();

        TreeNode node = root;
        queue.add(node);
        //����ÿ���node����
        //ÿ���Ƴ�ȫ������һ��ڵ�
        int j = 0;
        while (!queue.isEmpty()) {
            j++;
            int size = queue.size();
            while (size != 0) {
                TreeNode outNode = queue.removeFirst();
                if (outNode.left != null) {
                    queue.add(outNode.left);
                }
                if (outNode.right != null) {
                    queue.add(outNode.right);
                }
                if (outNode.left == null && outNode.right == null) {
                    return j;
                }
                size--;
            }
        }
        return 0;
    }

}
