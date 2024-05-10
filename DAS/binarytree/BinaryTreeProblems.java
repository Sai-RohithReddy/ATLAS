package binarytree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTreeProblems {
    public void leftView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {

                TreeNode current = q.poll();

                if (i == 0) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
        }
        System.out.println();
    }

    public void rightView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {

                TreeNode current = q.poll();

                if (i == levelSize - 1) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
        }
        System.out.println();
    }

    public void topView(TreeNode root) {
        class Pair {
            TreeNode node;
            int hd;

            public Pair(TreeNode node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        if (root == null) return;

        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair current = q.poll();
            TreeNode currNode = current.node;
            int currHd = current.hd;

            if (map.get(currHd) == null) {
                map.put(currHd, currNode.data);
            }
            if (currNode.left != null) {
                q.offer(new Pair(currNode.left, currHd - 1));
            }
            if (currNode.right != null) {
                q.offer(new Pair(currNode.right, currHd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }

    public void bottomView(TreeNode root) {
        class Pair {
            TreeNode node;
            int hd;

            public Pair(TreeNode node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
    
        if (root == null) return;

        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            TreeNode currNode = curr.node;
            int currHd = curr.hd;

            map.put(currHd, currNode.data);
            
            if (currNode.left != null) {
                q.offer(new Pair(currNode.left, currHd - 1));
            }
            if (currNode.right != null) {
                q.offer(new Pair(currNode.right, currHd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }
}
