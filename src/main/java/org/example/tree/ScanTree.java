package org.example.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的前中后序递归实现、层序遍历的队列实现
 *
 * @author nuanfeng
 * @date 2020/4/25 18:30
 */
public class ScanTree {
    /**
     * 前序遍历
     *
     * @param node
     */
    public static void orderPre(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf(node.getValue());
        orderPre(node.getLeft());
        orderPre(node.getRight());
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public static void ordermid(TreeNode node) {
        if (node == null) {
            return;
        }
        ordermid(node.getLeft());
        System.out.printf(node.getValue());
        ordermid(node.getRight());
    }

    /**
     * 后续遍历
     *
     * @param node
     */
    public static void orderAfter(TreeNode node) {
        if (node == null) {
            return;
        }
        orderAfter(node.getLeft());
        orderAfter(node.getRight());
        System.out.printf(node.getValue());
    }

    /**
     * 层序遍历
     *
     * @param node
     */
    public static void orderLevel(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            TreeNode nowNode = q.poll();
            System.out.printf(nowNode.value);
            if (nowNode.getLeft() != null) {
                q.add(nowNode.getLeft());
            }
            if (nowNode.getRight() != null) {
                q.add(nowNode.getRight());
            }
        }

    }

    /**
     * 前中后续遍历
     *
     * @param args
     */
    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        System.out.println("----------前序遍历递归实现");
        orderPre(myTree.getRoot());
        System.out.println();
        System.out.println("----------中序遍历递归实现");
        ordermid(myTree.getRoot());
        System.out.println();
        System.out.println("----------后序遍历递归实现");
        orderAfter(myTree.getRoot());
        System.out.println();
        System.out.println("----------层序遍历队列实现");
        orderLevel(myTree.getRoot());
    }


}

/**
 * ----------------A--------------------
 * -----------B----------C--------------
 * --------D-----E----------------------
 */
class MyTree {
    private TreeNode root = null;

    public MyTree() {
        init();
    }

    private void init() {
        TreeNode e = new TreeNode("E", null, null);
        TreeNode d = new TreeNode("D", null, null);
        TreeNode b = new TreeNode("B", d, e);
        TreeNode c = new TreeNode("C", null, null);
        TreeNode a = new TreeNode("A", b, c);
        root = a;
    }

    public TreeNode getRoot() {
        return root;
    }
}

class TreeNode {
    String value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


    public String getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }


}
