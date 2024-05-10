package binarytree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTreeProblems btp = new BinaryTreeProblems();

        bt.createBT();

        bt.print();

        // System.out.println(bt.height());
        // System.out.println(bt.size());

        System.out.print("Left view of binary tree is: ");
        btp.leftView(bt.root);

        System.out.print("Right view of binary tree is: ");
        btp.rightView(bt.root);

        System.out.print("Top view of binary tree is: ");
        btp.topView(bt.root);
        
        System.out.print("Bottom view of binary tree is: ");
        btp.bottomView(bt.root);
    }
}
