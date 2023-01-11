package datastructure.tree;

import java.util.Scanner;

class Node{
    int data ;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        right = null;
        left = null;
    }
}
public class Creaton_tree {
    static Node Create(){
        Scanner scn = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter root");
        int data = scn.nextInt();
        if(data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("enter left node"+root.data);
        root.left= Create();
        System.out.println("enter right node"+root.data);
        root.right = Create();
        return root;
    }

    static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println("-> "+root.data);
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root == null)
            return;
        System.out.println("-> "+root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println("-> "+root.data);
    }

    public static void main(String[] args) {
        Node root = Create();
        System.out.println("Inorder");
        inorder(root);
        System.out.println("Preorder");
        preorder(root);
        System.out.println("Postorder");
        postorder(root);
    }
}
