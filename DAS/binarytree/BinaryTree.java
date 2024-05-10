package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;
    int treeSize = 0;

    public void createBT() {
        root = new TreeNode(1);
        
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        treeSize = 7;
    }

    public void print() {
        print(root);
    }

    public void print(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        int height = height();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int j = height; j >= levelSize; j--) {
                System.out.print(" ");
            }

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = q.poll();

                System.out.print(current.data + " ");

                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }

            System.out.println("");
        }
    }

    public int height() {
        return height(root);
    }
    
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public int size() {
        return size(root);
    }
    
    public int size(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = size(root.left);
        int r = size(root.right);

        return l + r + 1;
    }
}
